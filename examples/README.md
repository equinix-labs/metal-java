API calls via OpenAPI generated Equinix bindings :

This directory contains samples/examples on how equinix bindings can be utlised to make API calls against equinix environment.
Note : Below mentioned cmds and executions are relative to root dir.

1. Need to build client locally
```
cd equinix-openapi-metal
mvn clean package
```

2. Set classpath to client jars relative to root of git repository.
```
export ExampleClassPath="equinix-openapi-metal/target/equinix-openapi-metal-1.0.0.jar:equinix-openapi-metal/target/lib/*"
```

3. Execute examples:

   3.1. Fetch list of metros from equinix env
   ```
   java -classpath $ExampleClassPath examples/ListMetros.java <API KEY TOKEN>
   ```

   3.2. Deploy a debian OS in Dallas's metro on "c3.small.x86" server plan using on demand:
   ```
   java -classpath $ExampleClassPath examples/CreateDevice.java <API KEY TOKEN> <PROJECT UUID>
   ```

   3.3. List orgs while showcasing include and exclude param features with pagination.
   ```
   java -classpath $ExampleClassPath examples/ListOrganizations.java <API KEY TOKEN>
   ```