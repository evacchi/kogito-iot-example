package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.kie.kogito.examples.iot.rest.LightService;
import org.kie.kogito.examples.iot.rest.DimmerRequest;
import org.kie.kogito.examples.iot.rest.DimmerResponse;

@ApplicationScoped
public class Light {
    @Inject
    @RestClient
    LightService lightService;

    public DimmerResponse dim(DimmerRequest value) {
        return lightService.dim(value);
    }
}