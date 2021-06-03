import longComparators.LongListComparator;
import model.CreateListOfLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 2:32 PM
 * @project SortListOfLongs
 */
public class MainApp {

    public static void main(String[] args) {
        CreateListOfLists createListOfLists = new CreateListOfLists();

        printListOfLists(createListOfLists.getListOfLongList());

        Collections.sort(createListOfLists.getListOfLongList(), new LongListComparator<>());

        System.out.println("\n");

        printListOfLists(createListOfLists.getListOfLongList());

    }

    private static void printListOfLists(List<List<Long>> listOfLists){
        AtomicInteger i = new AtomicInteger(1);
            listOfLists.forEach(l -> {
                System.out.print("List number " + i + ": {");
                i.getAndIncrement();
                l.forEach(v -> {
                    System.out.print(" " + v);
                });
                System.out.println(" }");
            });
    }


















    public static void printMap(Map<Integer, LinkedList<Long>> integerListMap){
        integerListMap.forEach((k, v) -> {
            System.out.print("\nkey: " + k);
            System.out.print(" values: { ");
            v.forEach(l -> System.out.print(l + " "));
            System.out.print("}");
        });
        System.out.println("\n");
    }

    public static void sortMap(Map<Integer, LinkedList<Long>> integerListMap){


    }

    private static Long returnLongNumber(Supplier<Long> supplier) {
        return supplier.get();
    }
}
