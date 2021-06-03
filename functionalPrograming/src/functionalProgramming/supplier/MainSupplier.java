package functionalProgramming.supplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author Double "B"
 * @created 30/03/2021 - 11:55 AM
 * @project OCP_java
 */
public class MainSupplier {

    public static void main(String[] args) {
        /** A Supplier is used when you want to generate or supply values without taking any input.*/

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        /** A Supplier is often used when constructing new objects */

        Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = () -> new StringBuilder();

        System.out.println("sb1: " + sb1.get());
        System.out.println("sb2: " + sb2.get());

        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
        System.out.println("arrayListSupplier size: " + arrayListSupplier.get().size());
    }


}
