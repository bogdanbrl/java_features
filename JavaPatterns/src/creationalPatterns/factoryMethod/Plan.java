package creationalPatterns.factoryMethod;

public abstract class Plan {

    protected double rate;

    abstract double getRate();

    public void calculateBill(double unitsConsumed) {
        System.out.println("You have to pay: " + (unitsConsumed * getRate()));
    }


}
