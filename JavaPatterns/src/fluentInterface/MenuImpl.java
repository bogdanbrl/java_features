package fluentInterface;

import java.util.ArrayList;
import java.util.List;

public class MenuImpl implements Menu {

    private List<Item> menuList;
    private List<Item> orderedList;

    public MenuImpl() {

        this.menuList = new ArrayList<>();
        this.orderedList = new ArrayList<>();
        menuList.add(new Pizza());
        menuList.add(new Beverage());
    }

    @Override
    public Menu showMenu() {
        for (Item item : menuList) {
            System.out.println(item.toString());
        }
        return this;
    }

    @Override
    public Menu order(List<String> order) {
        for (String orderedItem : order) {
            orderedList.add(getItem(orderedItem));
        }
        return this;
    }

    @Override
    public Menu eat() {
       for (Item item : orderedList) {
           System.out.println("Acuma consum " + item.getName());
       }
       return this;
    }

    @Override
    public Menu payOrder() {
        double suma = 0;
        for (Item items : orderedList) {
            suma += items.getPrice();
        }
        System.out.println("Aveti de platit suma de: " + suma);
        return this;
    }

    private Item getItem(String name) {
        for (Item item : menuList) {
            if (name.equalsIgnoreCase(item.getName())) {
                return item;
            }
        }
        throw new IllegalStateException("Itemul " + name + " nu a fost gasit");
    }

}
