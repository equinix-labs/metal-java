# Complex workflows

OpenAPI generated client bindings are granular in nature hence client SDK will only contain enough functionality to support runtime of single API call with needed serialisation and deserialisation. But SDK can be enhanced with addition of common complex workflows which involves multiple API calls with pre-built logic on what needs to be consumed and produced. This directory contains such complex workflows which will be moved under equinix client directory `equinix-openapi-metal/src/main/java/com/equinix` and become part of Equinix metal-java SDK, hence enhancing the user experience for Equinix metal-java SDK.

Movement of these workflows will be handled in Makefile right after client bindings are generated and before client is built.