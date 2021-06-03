package fluentInterface;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        Restaurant restaurant = new RestaurantImpl();
        restaurant.getByName("Pizza Hut").getMenu().showMenu().order(Arrays.asList("cola", "Margherita")).eat().payOrder();

    }
}
