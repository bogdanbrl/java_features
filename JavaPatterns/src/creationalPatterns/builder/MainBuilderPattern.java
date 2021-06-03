package creationalPatterns.builder;

import creationalPatterns.builder.Pizza.PizzaBuilder;

public class MainBuilderPattern {

    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder(30);
        Pizza margherita = pizzaBuilder.addCheese(true).addBacon(true).addOlive(true).addSauce(true).build();
        System.out.println(margherita);


        Pizza pizza2 = pizzaBuilder.addBacon(true).addOlive(true).addSauce(true).build();
        System.out.println(pizza2);
    }
}
