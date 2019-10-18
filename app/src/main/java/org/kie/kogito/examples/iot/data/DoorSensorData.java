package org.kie.kogito.examples.iot.data;

public class DoorSensorData {
    private final boolean frontDoor;
    private final boolean kitchenWindow;
    private final boolean bedRoomWindow;
    private final boolean bathRoomWindow;
    private final boolean livingRoomWindow;


    public DoorSensorData(boolean frontDoor, boolean kitchenWindow, boolean bedRoomWindow, boolean bathRoomWindow, boolean livingRoomWindow) {
        this.frontDoor = frontDoor;
        this.kitchenWindow = kitchenWindow;
        this.bedRoomWindow = bedRoomWindow;
        this.bathRoomWindow = bathRoomWindow;
        this.livingRoomWindow = livingRoomWindow;
    }

    public boolean isAlerted() {
        return frontDoor || kitchenWindow || bedRoomWindow || bathRoomWindow || livingRoomWindow;
    }

    public boolean isFrontDoor() {
        return this.frontDoor;
    }

    public boolean isKitchenWindow() {
        return this.kitchenWindow;
    }

    public boolean isBedRoomWindow() {
        return this.bedRoomWindow;
    }

    public boolean isBathRoomWindow() {
        return this.bathRoomWindow;
    }

    public boolean isLivingRoomWindow() {
        return this.livingRoomWindow;
    }

}