package deLaInstructor.interfaceseggregation.example;

public class EconomicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
