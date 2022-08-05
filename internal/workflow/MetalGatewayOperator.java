package com.equinix.workflow;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.api.MetalGatewaysApi;
import com.equinix.openapi.metal.v1.model.CreateMetalGatewayRequest;
import com.equinix.openapi.metal.v1.model.FindMetalGatewayById200Response;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.MetalGateway.StateEnum;
import com.equinix.openapi.metal.v1.model.MetalGatewayInput;

public class MetalGatewayOperator {
    private MetalGatewaysApi metalGatewaysApi;
    private final List<StateEnum> targetState= Arrays.asList(StateEnum.ACTIVE, StateEnum.READY);

    public MetalGatewayOperator(ApiClient apiClient) {
        this.metalGatewaysApi = new MetalGatewaysApi(apiClient);
    }

    public MetalGateway findMetalGateway(UUID metalGatewayId) throws ApiException {
        FindMetalGatewayById200Response response = metalGatewaysApi.findMetalGatewayById(metalGatewayId);
        return response.getMetalGateway();
    }

    public MetalGateway createMetalGatewayAndPoll(MetalGatewayInput metalGatewayInput, UUID projectId, int retries, Duration wait)
            throws ApiException, InterruptedException {
        CreateMetalGatewayRequest createMetalGatewayRequest = new CreateMetalGatewayRequest(metalGatewayInput);
        FindMetalGatewayById200Response response = metalGatewaysApi.createMetalGateway(projectId, createMetalGatewayRequest,1, 10);
        MetalGateway metalGateway = response.getMetalGateway();
        return metalGatewayCreatedAndPoll(metalGateway, retries, wait);
    }

    public void deleteMetalGateway(UUID metalGatewayId)
            throws ApiException {
        metalGatewaysApi.deleteMetalGateway(metalGatewayId);
    }

    private MetalGateway metalGatewayCreatedAndPoll(MetalGateway metalGateway, int retries, Duration wait)
            throws ApiException, InterruptedException {

        UUID metalGatewayId;
        for (int i=0; i<retries && !targetState.contains(metalGateway.getState()); i++) {
            metalGatewayId = metalGateway.getId();
            Thread.sleep(wait.toMillis());
            metalGateway = findMetalGateway(metalGatewayId);
        }
        return metalGateway;
    }
}
