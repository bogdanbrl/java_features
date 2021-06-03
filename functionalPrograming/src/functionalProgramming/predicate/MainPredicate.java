package functionalProgramming.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author Double "B"
 * @created 30/03/2021 - 12:09 PM
 * @project OCP_java
 */
public class MainPredicate {

    /** Predicate is often used when filtering or matching.
     * Both are common operations.
     * A BiPredicate is just like a  Predicate except that it takes two parameters instead of one. */
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String, String> bp1 = String::startsWith;
        BiPredicate<String, String> bp2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(bp1.test("chicken", "chick"));
        System.out.println(bp2.test("chicken", "chick"));

        // ------------------------------------------------------------------ //

        
    }
}
