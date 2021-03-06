package functionalProgramming.consumer;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Double "B"
 * @created 30/03/2021 - 12:03 PM
 * @project OCP_java
 */
public class MainConsumer {

    /** You use a Consumer when you want to do something with a parameter but not return anything.
    BiConsumer does the same thing except that it takes two parameters
     */

    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

        /** BiConsumer is called with two parameters. They don't have to be the same type.  */

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick",1);

        System.out.println(map);
    }
}
