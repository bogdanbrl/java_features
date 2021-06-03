package deLaInstructor.openclosed.example;

public class Store {

    public void checkout(double total, PaymentMethod paymentMethod) {
        paymentMethod.pay(total);
    }
}
