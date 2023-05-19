package com.equinix.workflow;

import com.equinix.openapi.metal.v1.api.AuthenticationApi;
import com.equinix.openapi.metal.v1.api.ProjectsApi;
import com.equinix.openapi.metal.v1.model.AuthToken;
import com.equinix.openapi.metal.v1.model.AuthTokenInput;
import com.equinix.openapi.metal.v1.model.AuthTokenList;
import com.equinix.openapi.metal.v1.model.ProjectList;
import com.equinix.openapi.ApiClient;

import java.util.AbstractMap.SimpleEntry;
import java.util.UUID;

public class ProjectAPIKeyOperator {
    private final AuthenticationApi authApi;
    private final ProjectsApi projectsApi;

    public ProjectAPIKeyOperator(String apiKey) {
        ApiClient client = new ApiClient();
        client.setApiKey(apiKey);
        this.authApi = new AuthenticationApi(client);
        this.projectsApi = new ProjectsApi(client);
    }

    public ProjectAPIKeyOperator(ApiClient client) {
        this.authApi = new AuthenticationApi(client);
        this.projectsApi = new ProjectsApi(client);
    }

    public UUID createProjectAPIKey(UUID projectId, String description) throws Exception {
        AuthTokenInput authTokenInput = new AuthTokenInput();
        authTokenInput.setDescription(description);

        AuthToken newAuthToken = authApi.createProjectAPIKey(projectId, authTokenInput);
        UUID newApiKeyId = newAuthToken.getId();
        return newApiKeyId;
    }

    public SimpleEntry<AuthToken, UUID> getProjectAuthTokenByToken(String token) throws Exception {
        ProjectList projectList = projectsApi.findProjects(null, null, null, null);
        if (projectList.getProjects().size() != 1) {
            throw new Exception("Expected only one project to be associated with the token");
        }
        UUID projectId = projectList.getProjects().get(0).getId();

        AuthTokenList tokenList = authApi.findProjectAPIKeys(projectId, null, null);
        for (AuthToken authToken : tokenList.getApiKeys()) {
            if (authToken.getToken().equals(token)) {
                return new SimpleEntry<>(authToken, projectId);
            }
        }
        throw new Exception("Provided token not found");
    }

    public void deleteAPIKey(UUID apiKeyId) throws Exception {
        authApi.deleteAPIKey(apiKeyId);
    }

    public String rotateProjectKey(String authToken) {
        try {
            SimpleEntry<AuthToken, UUID> result = getProjectAuthTokenByToken(authToken);
            AuthToken oldAuthToken = result.getKey();
            UUID projectId = result.getValue();

            if (oldAuthToken == null || oldAuthToken.getProject() == null) {
                throw new Exception("Cannot rotate API key. The current API key is not associated with a project.");
            }

            UUID newApiKeyId = createProjectAPIKey(projectId, "rotated-api-key");
            deleteAPIKey(oldAuthToken.getId());

            return newApiKeyId.toString();
        } catch (Exception e) {
            throw new RuntimeException("Failed to rotate the API key: " + e.getMessage(), e);
        }
    }
}
