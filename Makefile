.PHONY: docker_run docker_generate

CURRENT_UID := $(shell id -u)
CURRENT_GID := $(shell id -g)

##
# Preliminary definitions
##

# Openapi equinix metal spec
OPENAPI_URL=https://api.equinix.com/metal/v1/api-docs

# git repo : equinix metal-java sdk
GIT_ORG=equinix-labs
GIT_REPO=metal-java

# Equinix Metal OAS 3.0.0
OPENAPI_CONFIG:=spec/oas3.config.json
OPENAPI_GENERATED_CLIENT=equinix-openapi-metal/
CRI=docker # nerdctl

SPEC_BASE_URL:=https://api.equinix.com/metal/v1/api-docs
SPEC_ROOT_FILE:=openapi3.yaml
PATCHED_SPEC_ENTRY_POINT=spec/oas3.patched/openapi/public/${SPEC_ROOT_FILE}
PATCHED_SPEC_OUTPUT_DIR=spec/oas3.stitched/

SPEC_FETCHER=${CRI} run --rm -u ${CURRENT_UID}:${CURRENT_GID} -v $(CURDIR):/workdir --entrypoint sh mikefarah/yq:4.35.1 script/download_spec.sh

SPEC_DIR_FETCHED_FILE=spec/oas3.fetched/
SPEC_DIR_PATCHED_FILE=spec/oas3.patched/

# Patches
SPEC_FETCHED_PATCHES=patches/spec.fetched.json

##
# openapi-generator-cli - docker
##
OPENAPI_CODEGEN_IMAGE=openapitools/openapi-generator-cli:v6.6.0
DOCKER_OPENAPI=${CRI} run --rm -u ${CURRENT_UID}:${CURRENT_GID} -v $(CURDIR):/local ${OPENAPI_CODEGEN_IMAGE}

docker_run: clean patch pull docker_generate move-workflow build_client

pull:
	${CRI} pull ${OPENAPI_CODEGEN_IMAGE}

docker_generate:
	${DOCKER_OPENAPI} generate \
		-i /local/${PATCHED_SPEC_ENTRY_POINT} \
		-g java \
		-c /local/${OPENAPI_CONFIG} \
		-o /local/${OPENAPI_GENERATED_CLIENT} \
		--git-repo-id ${GIT_REPO} \
		--git-user-id ${GIT_ORG}

##
# Utility functions
##
fetch:
	${SPEC_FETCHER} ${SPEC_BASE_URL} ${SPEC_DIR_FETCHED_FILE}/openapi/public ${SPEC_ROOT_FILE}

clean:
	rm -rf ${OPENAPI_GENERATED_CLIENT}

# executing patch apply shell script
patch:
	rm -rf ${SPEC_DIR_PATCHED_FILE}
	cp -r ${SPEC_DIR_FETCHED_FILE} ${SPEC_DIR_PATCHED_FILE}

	for diff in $(shell find ${SPEC_FETCHED_PATCHES} -name \*.patch | sort -n); do \
		patch --no-backup-if-mismatch -N -t -p1 -i $$diff; \
	done

move-workflow:
	cp -r internal/workflow equinix-openapi-metal/src/main/java/com/equinix/

build_client:
	cd ${OPENAPI_GENERATED_CLIENT}; mvn clean package
