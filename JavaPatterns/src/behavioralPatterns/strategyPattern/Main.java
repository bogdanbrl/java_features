package behavioralPatterns.strategyPattern;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ingredient olive = new Ingredient("olive", 4);
        Ingredient mushrooms = new Ingredient("mushrooms", 2);
        Ingredient bacon = new Ingredient("bacon", 4);
        Ingredient cheese = new Ingredient("cheese", 8);
        Ingredient sauce = new Ingredient("sauce", 6);

        Pizza pizza = new Pizza();
        pizza.addIngredient(olive);
        pizza.addIngredient(mushrooms);
        pizza.addIngredient(bacon);
        pizza.addIngredient(cheese);
        pizza.addIngredient(sauce);

        System.out.println("How do you want to pay (cash or card)?");
        Scanner scanner = new Scanner(System.in);
        String paymentMethod = scanner.next();

        PaymentType paymentType = Enum.valueOf(PaymentType.class, paymentMethod.toUpperCase());


        //can be converted in factory pattern
        if(paymentType.equals(PaymentType.CASH)){
            pizza.payPizza(new CashPayment());
        }else {
            pizza.payPizza(new CardPayment("532165486123"));
        }

    }
}
