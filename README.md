# OpenAPI Generated Java Client for Equinix Metal

[![Experimental](https://img.shields.io/badge/Stability-Experimental-red.svg)](https://github.com/equinix-labs/equinix-labs/blob/main/uniform-standards.md)

> **[Experimental](https://github.com/equinix-labs/equinix-labs/blob/main/experimental-statement.md)**
> This is experimental. Don't use it in production. Examples demonstrate that this client is usable. Please submit patches and open issues with your experience. This repo contains java code generated from customized Equinix Metal oas3. The client is generated using the java client support built into the openapi-generator.

## Prerequisite:

1. Jq (https://stedolan.github.io/jq/) : Jq command is used inside makefile to format OAS 3.0 json read from equinix public url.
   ```
    brew install jq
   ```

2. Docker : We can generate metal-java client in two ways (described in later section), first is via utilising swagger codegen image to consume metal OAS 3.0 spec which is provided as option in makefile. To install docker refer : https://docs.docker.com/engine/install/.

3. Building the API client library requires:
   1. Java 1.7+
   2. Maven

  
## Running sample:

Build generated client:
```
cd equinix-openapi-metal
mvn clean package
```

The following executes list metro sample by consuming local jars produced after building generated metal-java client:
```
cd ..
java -classpath "equinix-openapi-metal/target/equinix-openapi-metal-1.0.0.jar:equinix-openapi-metal/target/lib/*" examples/ListMetros.java <API KEY TOKEN>
```

## Generate and build equinix metal java client:

Using openapi generator v3 docker image :
```
make docker_run
```

Using openapi generator v3 git repo :
```
make git_run
```

Note : Both docker and git pulls latest version of openapi generator.
