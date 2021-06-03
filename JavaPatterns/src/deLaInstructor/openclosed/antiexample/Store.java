package deLaInstructor.openclosed.antiexample;

public class Store {

    public void checkout(double total) {
        System.out.println("Paying a total sum of " + total + " in cash.");
    }

    public void checkout(double total, String paymentType) {
        if (paymentType.equals("cash")) {
            System.out.println("Paying a total sum of " + total + " in cash.");
        }
        else if (paymentType.equals("card")) {
            System.out.println("Paying a total sum of " + total + " by card.");
        }
    }
}
