package functionalProgramming.unaryoperatorAndBinaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Double "B"
 * @created 30/03/2021 - 12:21 PM
 * @project OCP_java
 */
public class MainUnaryOperator {

    /** UnaryOperator and BinaryOperator are a special case of a Function.
     * They require all type parameters to be the same type.
     * A UnaryOperator transforms its value into one of the same type.
     * For example, incrementing by one is a unary operation.
     * In fact, UnaryOperator extends Function.
     * A BinaryOperator merges two values into one of the same type.
     * Adding two numbers is a binary operation.
     * Similarly, BinaryOperator extends BiFunction.
     * */

    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));

        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string1, string2) -> string1.concat(string2);

        System.out.println(b1.apply("baby ", "chick"));
        System.out.println(b2.apply("baby ", "chick"));
    }
}
