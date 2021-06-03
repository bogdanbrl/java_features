package functionalProgramming.advancedStreamPipeline;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author Double "B"
 * @created 31/03/2021 - 12:52 PM
 * @project OCP_java
 */
public class MainAdvancedStreamPipeline {

    public static void main(String[] args) {

        /** Remember that streams are lazily evaluated.
         * This means that the stream is actually created when it is needed */

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("\n\n\nCollecting Using Basic Collectors");
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2);

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3);

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map4 = ohMy4.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map4);

        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map5 = ohMy5.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map5);
        System.out.println(map5.getClass());

        var ohMy6 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map6 = ohMy6.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map6);
        System.out.println(map6.getClass());

        var ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map7 = ohMy7.collect(
                groupingBy(String::length));
        System.out.println(map7);

        var ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map8 = ohMy8.collect(
                groupingBy(
                        String::length,
                        Collectors.toSet()));
        System.out.println(map8);

        var ohMy9 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map9 = ohMy9.collect(
                groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map9);

        var ohMy10 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map10 = ohMy10.collect(
                groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map10);

        var ohMy11 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map11 = ohMy11.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map11);

        var ohMy12 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map12 = ohMy12.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map12);

        var ohMy13 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map13 = ohMy13.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map13);

        var ohMy14 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map14 = ohMy14.collect(
                groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map14);

        var ohMy15 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map15 = ohMy15.collect(
                groupingBy(
                        String::length,
                        mapping(
                                s -> s.charAt(0),
                                minBy((a, b) -> a -b))));
        System.out.println(map15);

        var ohMy16 = Stream.of("lions", "tigers", "bears");
        var map16 = ohMy16.collect(groupingBy(String::length,
                mapping(s -> s.charAt(0), minBy((a, b) -> a -b))));
        System.out.println(map16);




    }
}
