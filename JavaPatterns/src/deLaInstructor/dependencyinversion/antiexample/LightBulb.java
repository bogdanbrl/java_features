package deLaInstructor.dependencyinversion.antiexample;

public class LightBulb {
    private ElectricWire electricWire;

    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
        electricWire.setVolts(10);
    }
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }

    public ElectricWire getElectricWire() {
        return electricWire;
    }
}
