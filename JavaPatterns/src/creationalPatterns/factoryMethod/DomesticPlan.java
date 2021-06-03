package creationalPatterns.factoryMethod;

public class DomesticPlan extends Plan {

    @Override
    public double getRate() {
        rate = 9.5;
        return rate;
    }

}
