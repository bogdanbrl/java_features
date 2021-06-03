package fluentInterface;

public class Beverage implements Item {

    private String name;
    private double price;
    private String ingredients;

    public Beverage() {
        this.name = "Cola";
        this.price = 5;
        this.ingredients = "apa, zahar";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getIngredients() {
        return this.ingredients;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", ingredients=" + ingredients;
    }
}
