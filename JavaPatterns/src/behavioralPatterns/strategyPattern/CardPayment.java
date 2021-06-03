package behavioralPatterns.strategyPattern;

public class CardPayment implements Payment{

    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double price) {
        System.out.println("You have paid " + price + " with card no " + cardNumber);
    }
}
