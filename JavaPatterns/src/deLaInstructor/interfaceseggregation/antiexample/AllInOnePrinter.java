package deLaInstructor.interfaceseggregation.antiexample;

public class AllInOnePrinter implements SmartDevice {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Beeep booop biiippp sending fax...");
    }
}
