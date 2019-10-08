package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DoorLock {
    public boolean locked = false;
    public Object lock(Object o) {
        this.locked = true;
        return null;
    }
    public Object unlock(Object o) {
        this.locked = false;
        return null;
    }
}