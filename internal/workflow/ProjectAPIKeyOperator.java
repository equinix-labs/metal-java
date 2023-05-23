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
    private AuthenticationApi authApi;
    private ProjectsApi projectsApi;
    private ApiClient apiClient;

    public void initializeApiClient(String apiKey) {
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        authApi = new AuthenticationApi(apiClient);
        projectsApi = new ProjectsApi(apiClient);
    }

    public AuthToken createProjectAPIKey(UUID projectId, String description) throws Exception {
        AuthTokenInput authTokenInput = new AuthTokenInput();
        authTokenInput.setDescription(description);

        AuthToken newAuthToken = authApi.createProjectAPIKey(projectId, authTokenInput);
        return newAuthToken;
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

    public AuthToken rotateProjectKey(String authToken) {
        try {
            SimpleEntry<AuthToken, UUID> result = getProjectAuthTokenByToken(authToken);
            AuthToken oldAuthToken = result.getKey();
            UUID projectId = result.getValue();

            if (oldAuthToken == null || oldAuthToken.getProject() == null) {
                throw new Exception("Cannot rotate API key. The current API key is not associated with a project.");
            }

            AuthToken newAuthToken = createProjectAPIKey(projectId, "rotated-api-key");

            // Update the API client with the new API key
            initializeApiClient(newAuthToken.getToken());

            deleteAPIKey(oldAuthToken.getId());

            return newAuthToken;
        } catch (Exception e) {
            throw new RuntimeException("Failed to rotate the API key: " + e.getMessage(), e);
        }
    }
}
