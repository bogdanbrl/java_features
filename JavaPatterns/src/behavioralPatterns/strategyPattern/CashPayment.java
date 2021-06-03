package behavioralPatterns.strategyPattern;

public class CashPayment implements Payment{


    @Override
    public void pay(double price) {
        System.out.println("You have paid " + price + " cash!");
    }
}
