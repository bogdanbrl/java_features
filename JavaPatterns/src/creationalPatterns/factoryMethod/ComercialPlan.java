package creationalPatterns.factoryMethod;

public class ComercialPlan extends Plan{

    @Override
    public double getRate() {
        rate = 7.5;
        return rate;
    }

}
