package deLaInstructor.interfaceseggregation.example;

public class AllInOnePrinter implements Scanner, Printer, Fax {
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
