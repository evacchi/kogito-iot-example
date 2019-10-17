package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DoorSensors {
    public Object getStatus(Object o) {
        System.out.println("all ok");
        return null;
    }
}