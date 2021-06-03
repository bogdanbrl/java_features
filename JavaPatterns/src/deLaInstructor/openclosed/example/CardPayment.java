package deLaInstructor.openclosed.example;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(double total) {
        System.out.println("Paying a total sum of " + total + " by card");
    }
}
