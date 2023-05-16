package com.equinix.workflow;

import com.equinix.openapi.metal.v1.api.AuthenticationApi;
import com.equinix.openapi.metal.v1.model.AuthToken;
import com.equinix.openapi.metal.v1.model.AuthTokenInput;
import com.equinix.openapi.metal.v1.model.AuthTokenList;
import com.equinix.openapi.ApiClient;

import java.util.UUID;

public class ProjectAPIKeyOperator {
    private final AuthenticationApi authApi;

    public ProjectAPIKeyOperator(String apiKey) {
        ApiClient client = new ApiClient();
        client.setApiKey(apiKey);
        this.authApi = new AuthenticationApi(client);
    }

    public ProjectAPIKeyOperator(ApiClient client) {
        this.authApi = new AuthenticationApi(client);
    }

    public UUID createProjectAPIKey(UUID projectId, String description) throws Exception {
        AuthTokenInput authTokenInput = new AuthTokenInput();
        authTokenInput.setDescription(description);

        AuthToken newAuthToken = authApi.createProjectAPIKey(projectId, authTokenInput);
        UUID newApiKeyId = newAuthToken.getId();
        return newApiKeyId;
    }

    public UUID getOldKeyUUID(UUID projectId, String oldKey) throws Exception {
        AuthTokenList tokenList = authApi.findProjectAPIKeys(projectId, null, null);
        for (AuthToken token : tokenList.getApiKeys()) {
            if (token.getToken().equals(oldKey)) {
                return token.getId();
            }
        }
        throw new Exception("Old API key not found");
    }

    public void deleteAPIKey(UUID apiKeyId) throws Exception {
        authApi.deleteAPIKey(apiKeyId);
    }

    public static void main(String[] args) {
        String oldApiKey = "";
        if (oldApiKey.isEmpty()) {
            throw new IllegalArgumentException("API Key is not set. Please set the oldApiKey variable.");
        }

        String projectIdString = "";
        if (projectIdString.isEmpty()) {
            throw new IllegalArgumentException("Project ID is not set. Please set the projectID variable.");
        }

        ProjectAPIKeyOperator projAPIKeyOperator = new ProjectAPIKeyOperator(oldApiKey);
        UUID projectId = UUID.fromString(projectIdString);
        try {
            projAPIKeyOperator.createProjectAPIKey(projectId, "test-api-key");

            UUID oldApiKeyId = projAPIKeyOperator.getOldKeyUUID(projectId, oldApiKey);
            projAPIKeyOperator.deleteAPIKey(oldApiKeyId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
