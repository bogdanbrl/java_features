package functionalProgramming.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Double "B"
 * @created 30/03/2021 - 12:13 PM
 * @project OCP_java
 */
public class MainFunction {

    /** A Function is responsible for turning one parameter into a value of a potentially different type and returning it.
     *  Similarly, a BiFunction is responsible for turning two parameters into a value and returning it.
     *  */

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        BiFunction<String, String, String> bf1 = String::concat;
        BiFunction<String, String, String> bf2 = (string1, string2) -> string1.concat(string2);

        System.out.println(bf1.apply("baby ", "chick"));
        System.out.println(bf2.apply("baby ", "chick"));

    }
}
