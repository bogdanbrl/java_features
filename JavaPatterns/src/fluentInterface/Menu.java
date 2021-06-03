package fluentInterface;

import java.util.List;

public interface Menu {

    Menu showMenu();
    Menu order(List<String> order);
    Menu eat();
    Menu payOrder();
}
