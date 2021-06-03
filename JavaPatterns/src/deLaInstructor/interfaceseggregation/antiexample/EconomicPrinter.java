package deLaInstructor.interfaceseggregation.antiexample;

public class EconomicPrinter implements SmartDevice {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Cannot scan");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Cannot send fax");
    }
}
