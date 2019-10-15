package org.kie.kogito.examples.iot.rest;

public class DimmerResponse {
    private final double value;
    public DimmerResponse(double value) {
        this.value = value;
    }
    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }
}
