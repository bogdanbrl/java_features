package fluentInterface;

public class Pizza implements Item{

    private double price;
    private String name;
    private String ingredients;

    public Pizza() {
        this.price = 30;
        this.name = "Margherita";
        this.ingredients = "mozzarella, sos";   //aceste field uri pot fi date ca parametru pentru a creea mai multe tipuri de pizza
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
