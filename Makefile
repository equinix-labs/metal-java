.PHONY: docker_run git_run pre-spec-patch

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
SPEC_FETCHED_FILE:=spec/oas3.fetched.json
SPEC_PATCHED_FILE:=spec/oas3.patched.json
OPENAPI_CONFIG:=spec/oas3.config.json
OPENAPI_GENERATED_CLIENT=equinix-openapi-metal/

OPENAPI_CODEGEN_TAG=v6.0.1

# Patches

SPEC_FETCHED_PATCHES=patches/spec.fetched.json

##
# Swagger codegen - git
##
OPENAPI_GIT_URL=https://github.com/OpenAPITools/openapi-generator.git
OPENAPI_GIT_DIR=openapi-generator/
OPENAPI_GIT_JAR=modules/openapi-generator-cli/target/openapi-generator-cli.jar

git_run: pre-common clone git_generate post-common

clone:
	git clone ${OPENAPI_GIT_URL} --branch ${OPENAPI_CODEGEN_TAG} --single-branch
	cd ${OPENAPI_GIT_DIR}; mvn clean package

git_generate:
	java -jar ${OPENAPI_GIT_DIR}/${OPENAPI_GIT_JAR} generate \
		-i ${SPEC_PATCHED_FILE} \
		-g java \
		-c ${OPENAPI_CONFIG} \
		-o ${OPENAPI_GENERATED_CLIENT} \
		--git-repo-id ${GIT_REPO} \
		--git-user-id ${GIT_ORG}

##
# Swagger codegen - docker
##
OPENAPI_CODEGEN_IMAGE=openapitools/openapi-generator-cli:${OPENAPI_CODEGEN_TAG}
DOCKER_OPENAPI=docker run --rm -u ${CURRENT_UID}:${CURRENT_GID} -v $(CURDIR):/local ${OPENAPI_CODEGEN_IMAGE}

docker_run: pre-common pull docker_generate post-common

pull:
	docker pull ${OPENAPI_CODEGEN_IMAGE}

docker_generate:
	${DOCKER_OPENAPI} generate \
		-i /local/${SPEC_PATCHED_FILE} \
		-g java \
		-c /local/${OPENAPI_CONFIG} \
		-o /local/${OPENAPI_GENERATED_CLIENT} \
		--git-repo-id ${GIT_REPO} \
		--git-user-id ${GIT_ORG}

##
# Utility functions
##
fetch:
	curl ${OPENAPI_URL} | jq . > ${SPEC_FETCHED_FILE}

clean:
	rm -rf ${OPENAPI_GENERATED_CLIENT}
	rm -rf ${OPENAPI_GIT_DIR}

pre-common: clean pre-spec-patch

post-common: build_client

# For patches summary refer : metal-java/patches/README.md
pre-spec-patch:
	# patch is idempotent, always starting with the fetched
	# fetched file to create the patched file.
	cp ${SPEC_FETCHED_FILE} ${SPEC_PATCHED_FILE}
	ARGS="-o ${SPEC_PATCHED_FILE} ${SPEC_FETCHED_FILE}"; \
	for diff in $(shell find ${SPEC_FETCHED_PATCHES} -name \*.patch | sort -n); do \
		patch --no-backup-if-mismatch -N -t $$ARGS $$diff; \
		ARGS=${SPEC_PATCHED_FILE}; \
	done

patch-client-post:

build_client:
	cd ${OPENAPI_GENERATED_CLIENT}; mvn clean package
