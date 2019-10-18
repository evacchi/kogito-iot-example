package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

import org.kie.kogito.examples.iot.data.DoorSensorData;


@ApplicationScoped
public class DoorSensors {
    public DoorSensorData getStatus(Object o) {
        DoorSensorData data = new DoorSensorData();
        data.setFrontDoor(Math.random() > .5 ? true : false);
        return data;
    }
}