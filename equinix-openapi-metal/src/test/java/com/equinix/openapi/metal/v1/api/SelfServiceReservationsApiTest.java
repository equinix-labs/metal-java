/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.model.CreateSelfServiceReservationRequest;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.SelfServiceReservationList;
import com.equinix.openapi.metal.v1.model.SelfServiceReservationResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfServiceReservationsApi
 */
@Disabled
public class SelfServiceReservationsApiTest {

    private final SelfServiceReservationsApi api = new SelfServiceReservationsApi();

    /**
     * Create a reservation
     *
     * Creates a reservation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSelfServiceReservationTest() throws ApiException {
        UUID projectId = null;
        CreateSelfServiceReservationRequest createSelfServiceReservationRequest = null;
        SelfServiceReservationResponse response = api.createSelfServiceReservation(projectId, createSelfServiceReservationRequest);
        // TODO: test validations
    }

    /**
     * Retrieve a reservation
     *
     * Returns a reservation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findSelfServiceReservationTest() throws ApiException {
        UUID id = null;
        UUID projectId = null;
        SelfServiceReservationResponse response = api.findSelfServiceReservation(id, projectId);
        // TODO: test validations
    }

    /**
     * Retrieve all reservations
     *
     * Returns all reservations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findSelfServiceReservationsTest() throws ApiException {
        UUID projectId = null;
        Integer page = null;
        Integer perPage = null;
        SelfServiceReservationList response = api.findSelfServiceReservations(projectId, page, perPage);
        // TODO: test validations
    }

}
