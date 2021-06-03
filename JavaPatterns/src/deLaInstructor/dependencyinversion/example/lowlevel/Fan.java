package deLaInstructor.dependencyinversion.example.lowlevel;

import deLaInstructor.dependencyinversion.example.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
