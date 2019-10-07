package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DoorLock {
    public boolean locked = false;
    public void lock() {
        this.locked = true;
    }
    public void unlock() {
        this.locked = false;
    }
}