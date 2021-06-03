package deLaInstructor.dependencyinversion.example.highlevel;

public class ElectricPowerSwitch implements Switch {

    public Switchable switchableDevice;
    public boolean on;

    public ElectricPowerSwitch(Switchable switchableDevice) {
        this.switchableDevice = switchableDevice;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press(){

        boolean checkOn = isOn();

        if (checkOn) {
            switchableDevice.turnOff();
            this.on = false;
        } else {
            switchableDevice.turnOn();
            this.on = true;
        }
    }
}
