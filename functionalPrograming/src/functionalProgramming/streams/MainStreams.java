package functionalProgramming.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Double "B"
 * @created 30/03/2021 - 1:11 PM
 * @project OCP_java
 */
public class MainStreams {

    public static void main(String[] args) {
        /** finite streams */
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        empty.forEach(System.out::println);
        singleElement.forEach(System.out::println);
        fromArray.forEach(System.out::println);

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        fromList.forEach(System.out::println);

        System.out.println("Parallel stream -- threads --");
        Stream<String> fromListParallel = list.parallelStream();
        fromListParallel.forEach(System.out::println);

        /** infinite streams */

        System.out.println("\n\n\n Infinite streams");
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        Stream<Integer> oddNumberUnder100 = Stream.iterate(1, n->n<100, n->n+2);
        oddNumberUnder100.forEach(System.out::println);

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());

        Stream<String> stream = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = stream.min(Comparator.comparingInt(String::length));
        min.ifPresent(System.out::println);

        System.out.println("\n\n -----------------------");
        Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s2.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);
        //infinite.forEach(System.out::println);

        System.out.println("\n\n\n allMatch(), anyMatch(), and noneMatch()");
        var list3 = List.of("monkey", "2", "chimp");
        Stream<String> infinite3 = Stream.generate(() -> "chimp");
        Predicate<String> pred3 = x -> Character.isLetter(x.charAt(0));

        System.out.println(list3.stream().anyMatch(pred3));  // true
        System.out.println(list3.stream().allMatch(pred3));  // false
        System.out.println(list3.stream().noneMatch(pred3)); // false
        System.out.println(infinite3.anyMatch(pred3));


        System.out.println("\n\n\n reduce()");
        /** The reduce() method combines a stream into a single object. It is a reduction, which means it processes all elements */
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var a: array) result = result + s;
        System.out.println(result);

        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        String word = stream4.reduce("", (sa, c) -> sa + c);
        System.out.println(word);

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty9 = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        //empty.reduce(op).ifPresent(System.out::println);         // no output
        oneElement.reduce(op).ifPresent(System.out::println);    // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        System.out.println("\n\n\n collect()");

        Stream<String> stream1 = Stream.of("w", "o", "l","f");
        StringBuilder stringBuilder = stream1.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );
        System.out.println(stringBuilder);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");

        TreeSet<String> set = stream.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]


    }
}
