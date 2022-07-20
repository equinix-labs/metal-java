.PHONY: generate

OPENAPI_URL=https://api.equinix.com/metal/v1/api-docs
PACKAGE=com.equinix.openapi.metal.v1

generate:
	docker run --rm -v $(PWD):/local swaggerapi/swagger-codegen-cli generate \
		-i $(OPENAPI_URL) -l java \
		--invoker-package $(PACKAGE) \
		--api-package $(PACKAGE).api \
		--model-package $(PACKAGE).model \
		--group-id com.equinix.api \
		--artifact-id metal-api-client \
		--git-repo-base-url https://github.com \
		--git-repo-id metal-java \
		--git-user-id equinix-labs \
		-o /local/
