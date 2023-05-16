package com.equinix.test.functional;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.workflow.ProjectAPIKeyOperator;

public class TestProjectAPIKeyOperator {
    private static final Logger logger = LoggerFactory.getLogger(TestProjectAPIKeyOperator.class);
    private final String sysTokenKey = "FUNCTIONAL_TOKEN_KEY";
    private final String sysProjUuidKey = "FUNCTIONAL_TEST_PROJECT_UUID";
    private ProjectAPIKeyOperator projectAPIKeyOperator;

    @Before
    public void setup() {
        logger.info("Executing TestProjectAPIKeyOperator setup...");

        // These properties need to be added dynamically before test execution.
        String token = System.getenv(sysTokenKey);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: x_auth_token
        ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
        x_auth_token.setApiKey(token);
        projectAPIKeyOperator = new ProjectAPIKeyOperator(defaultClient);
    }

    @Test
    public void testAPIKeyLifecycle() throws ApiException {
        logger.info("Executing Test: testAPIKeyLifecycle...");
        UUID projectId = UUID.fromString(System.getenv(sysProjUuidKey));

        String description = "test-api-key";
        UUID newApiKeyId = null;
        try {
            newApiKeyId = projectAPIKeyOperator.createProjectAPIKey(projectId, description);
            Assert.assertNotNull(newApiKeyId);
            logger.info(String.format("Created new API Key with ID: %s", newApiKeyId));
        } catch (Exception e) {
            Assert.fail("Error: " + e.getMessage());
        }

        String oldApiKey = System.getenv(sysTokenKey);
        UUID oldApiKeyId = null;
        try {
            oldApiKeyId = projectAPIKeyOperator.getOldKeyUUID(projectId, oldApiKey);
            Assert.assertNotNull(oldApiKeyId);
            logger.info(String.format("Retrieved old API Key ID: %s", oldApiKeyId));
        } catch (Exception e) {
            Assert.fail("Error: " + e.getMessage());
        }

        try {
            projectAPIKeyOperator.deleteAPIKey(oldApiKeyId);
            Assert.assertThrows(ApiException.class, () -> projectAPIKeyOperator.getOldKeyUUID(projectId, oldApiKey));
            logger.info(String.format("Successfully deleted old API Key with ID: %s", oldApiKeyId));
        } catch (Exception e) {
            Assert.fail("Error: " + e.getMessage());
        } finally {
            if (newApiKeyId != null) {
                // ensure the new key is deleted after the test
                try {
                    projectAPIKeyOperator.deleteAPIKey(newApiKeyId);
                } catch (Exception ignore) {
                }
            }
        }
    }
}
