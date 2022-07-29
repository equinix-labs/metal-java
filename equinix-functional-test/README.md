# Equinix functional test

Export following values as system/environment variable.
```
export FUNCTIONAL_TEST_TOKEN=<API KEY TOKEN>
export FUNCTIONAL_TEST_PROJECT_UUID=<PROJECT UUID>
```

Build and install client into local mvn repository
```
cd equinix-openapi-metal
mvn clean install
```

Running functional test against environment:
```
cd equinix-functional-test
mvn clean package
```

Note: Property files in equinix-functional-test/src/test/resources/ holds few default key-values such as metro, os and plan values in case of testing device manager workflow.