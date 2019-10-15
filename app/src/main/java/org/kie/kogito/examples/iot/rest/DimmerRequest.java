package org.kie.kogito.examples.iot.rest;

public class DimmerRequest {
    private final double value;
    public DimmerRequest(double value) {
        this.value = value;
    }
    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }
}
