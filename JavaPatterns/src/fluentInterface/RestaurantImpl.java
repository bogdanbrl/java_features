package fluentInterface;

public class RestaurantImpl implements Restaurant {

    private String name;
    private Menu meniu;

    public RestaurantImpl() {
        this.meniu = new MenuImpl();
    }

    @Override
    public Restaurant getByName(String name) {
        this.name = name;
        System.out.println("Ai intrat in restaurantul " + name);
        return this;
    }

    @Override
    public Menu getMenu() {
        return this.meniu;
    }

}
