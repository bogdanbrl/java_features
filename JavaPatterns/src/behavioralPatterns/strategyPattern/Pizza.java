package behavioralPatterns.strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<Ingredient> ingredientList;
    private double pizzaPrice;

    public Pizza() {
        this.ingredientList = new ArrayList<>();
        this.pizzaPrice = 10;
    }

    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient){
        ingredientList.remove(ingredient);
    }

    public double calculateTotalPizzaPrice(){
        double totalPrice = pizzaPrice;

        for (Ingredient ingredient: ingredientList) {
            totalPrice = totalPrice + ingredient.getPrice();
        }
        return totalPrice;
    }

    public void payPizza(Payment payment){
        double totalPizzaPrice = calculateTotalPizzaPrice();
        System.out.println("You need to pay " + totalPizzaPrice);
        payment.pay(totalPizzaPrice);
    }

}
