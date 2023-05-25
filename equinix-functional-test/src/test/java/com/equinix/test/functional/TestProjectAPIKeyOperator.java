package com.equinix.test.functional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.auth.ApiKeyAuth;
import com.equinix.workflow.AuthToken;
import com.equinix.workflow.ProjectAPIKeyOperator;

public class TestProjectAPIKeyOperator {
    private static final Logger logger = LoggerFactory.getLogger(TestProjectAPIKeyOperator.class);
    private final String sysTokenKey = "FUNCTIONAL_TOKEN_KEY";
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
        projectAPIKeyOperator = new ProjectAPIKeyOperator();
        projectAPIKeyOperator.initializeApiClient(token);
    }

    @Test
    public void testAPIKeyRotation() {
        logger.info("Executing Test: testAPIKeyRotation...");
        String oldApiKey = System.getenv(sysTokenKey);

        try {
            AuthToken newAuthToken = projectAPIKeyOperator.rotateProjectKey(oldApiKey);
            Assert.assertNotNull(newAuthToken);
            logger.info("Successfully rotated old API key. New API Key: " + newAuthToken.getToken());
        } catch (Exception e) {
            Assert.fail("Error: " + e.getMessage());
        }
    }
}
