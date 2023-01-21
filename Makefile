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

PATCHED_SPEC_ENTRY_POINT=spec/oas3.patched/openapi/public/openapi3.yaml
PATCHED_SPEC_OUTPUT_DIR=spec/oas3.stitched/

SPEC_PATCHED_FILE=oas3.stitched.metal.yaml

SPEC_DIR_FETCHED_FILE=spec/oas3.fetched/
SPEC_DIR_PATCHED_FILE=spec/oas3.patched/

# Patches
SPEC_FETCHED_PATCHES=patches/spec.fetched.json

##
# openapi-generator-cli - docker
##
OPENAPI_CODEGEN_TAG=latest

OPENAPI_CODEGEN_IMAGE=openapitools/openapi-generator-cli:${OPENAPI_CODEGEN_TAG}
DOCKER_OPENAPI=docker run --rm -u ${CURRENT_UID}:${CURRENT_GID} -v $(CURDIR):/local ${OPENAPI_CODEGEN_IMAGE}

docker_run: clean pre-spec-patch-dir pull docker_generate_spec docker_generate move-workflow build_client

pull:
	docker pull ${OPENAPI_CODEGEN_IMAGE}

docker_generate:
	${DOCKER_OPENAPI} generate \
		-i /local/${PATCHED_SPEC_OUTPUT_DIR}/${SPEC_PATCHED_FILE} \
		-g java \
		-c /local/${OPENAPI_CONFIG} \
		-o /local/${OPENAPI_GENERATED_CLIENT} \
		--git-repo-id ${GIT_REPO} \
		--git-user-id ${GIT_ORG}

docker_generate_spec:
	${DOCKER_OPENAPI} generate \
		-i /local/${PATCHED_SPEC_ENTRY_POINT} \
		-g openapi-yaml \
		-p skipOperationExample=true -p outputFile=oas3.stitched.metal.yaml \
		-o /local/${PATCHED_SPEC_OUTPUT_DIR}

##
# Utility functions
##
fetch:
	curl ${OPENAPI_URL} | jq . > ${SPEC_FETCHED_FILE}

clean:
	rm -rf ${OPENAPI_GENERATED_CLIENT}
	rm -rf ${OPENAPI_GIT_DIR}

# executing patch apply shell script
pre-spec-patch-dir:
	rm -rf ${SPEC_DIR_PATCHED_FILE}
	cp -r ${SPEC_DIR_FETCHED_FILE} ${SPEC_DIR_PATCHED_FILE}

	for diff in $(shell find ${SPEC_FETCHED_PATCHES} -name \*.patch | sort -n); do \
		patch -p1 < $$diff; \
	done


move-workflow:
	cp -r internal/workflow equinix-openapi-metal/src/main/java/com/equinix/

build_client:
	cd ${OPENAPI_GENERATED_CLIENT}; mvn clean package
