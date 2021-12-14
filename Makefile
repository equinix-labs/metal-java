.PHONY: generate

OPENAPI_URL=https://api.equinix.com/metal/v1/api-docs
PACKAGE=net.packet.client

generate:
	docker run --rm -v $(PWD):/local swaggerapi/swagger-codegen-cli generate \
		-i $(OPENAPI_URL) -l java \
		--invoker-package $(PACKAGE) \
		--api-package $(PACKAGE).api \
		--model-package $(PACKAGE).model \
		--group-id net.packet \
		--artifact-id packet-api-client \
		--git-repo-base-url https://github.com \
		--git-repo-id packet-api-java \
		--git-user-id packethost \
		-o /local/
