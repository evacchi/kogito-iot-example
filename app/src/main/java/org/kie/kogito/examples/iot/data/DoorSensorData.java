package org.kie.kogito.examples.iot.data;

public class DoorSensorData {
    private boolean frontDoor;
    private boolean kitchenWindow;
    private boolean bedRoomWindow;
    private boolean bathRoomWindow;
    private boolean livingRoomWindow;

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

    public void setFrontDoor(boolean frontDoor) {
        this.frontDoor = frontDoor;
    }

    public void setKitchenWindow(boolean kitchenWindow) {
        this.kitchenWindow = kitchenWindow;
    }

    public void setBedRoomWindow(boolean bedRoomWindow) {
        this.bedRoomWindow = bedRoomWindow;
    }

    public void setBathRoomWindow(boolean bathRoomWindow) {
        this.bathRoomWindow = bathRoomWindow;
    }

    public void setLivingRoomWindow(boolean livingRoomWindow) {
        this.livingRoomWindow = livingRoomWindow;
    }
    


    @Override
    public String toString() {
        return "{" +
            " frontDoor='" + isFrontDoor() + "'" +
            ", kitchenWindow='" + isKitchenWindow() + "'" +
            ", bedRoomWindow='" + isBedRoomWindow() + "'" +
            ", bathRoomWindow='" + isBathRoomWindow() + "'" +
            ", livingRoomWindow='" + isLivingRoomWindow() + "'" +
            "}";
    }

}