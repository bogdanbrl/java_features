package deLaInstructor.dependencyinversion.antiexample;

public class ElectricPowerSwitchLightBulb {

    public LightBulb lightBulb; // immediate friend
    public boolean on;

    public ElectricPowerSwitchLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press(){

        boolean checkOn = isOn();

        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            //lightBulb.getElectricWire().setVolts(10); // this is a stranger, do not talk to strangers!
            this.on = true;
        }
    }
}
