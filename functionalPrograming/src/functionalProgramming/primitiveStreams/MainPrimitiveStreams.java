package functionalProgramming.primitiveStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Double "B"
 * @created 31/03/2021 - 11:12 AM
 * @project OCP_java
 */
public class MainPrimitiveStreams {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        if (avg.isPresent()) {
            System.out.println(avg.getAsDouble());
        }

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        System.out.println("\n\n\ndouble stream");
        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        System.out.println("\n\n\nint stream");
        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::println);

        System.out.println("\n\n\nint stream range");
        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);

        System.out.println("\n\n\nint stream range close");
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);

        List<Integer> intList = IntStream.rangeClosed(1, 20).collect(ArrayList::new, List::add, List::addAll);
        intList.forEach(System.out::println);

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream1 = objStream.mapToInt(String::length);

        System.out.println("\n\n\nusing flatMap()");
        var integerList = new ArrayList<Integer>();
        integerList.add(6);
        integerList.add(16);
        integerList.add(98);
        integerList.add(2);
        integerList.add(35);
        integerList.add(78);

        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream()
                .flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream()
                .flatMapToLong(x -> LongStream.of(x));

        System.out.println("\nprint ints");
        ints.forEach(System.out::println);
        System.out.println("\nprint doubles");
        doubles.forEach(System.out::println);
        System.out.println("\nprint longs");
        longs.forEach(System.out::println);

        System.out.println("create a stream from a primitive stream");
        IntStream ints2 = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));

        Stream<Integer> boxedToObj = ints2.boxed();
        boxedToObj.forEach(System.out::println);

        System.out.println("\n\n\ncalculate average");
        var stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();
        optional.ifPresentOrElse(
                o -> System.out.println(o),
                () -> System.out.println("Average cannot be calculated!")
        );

        System.out.println("\n\n\ntest with long stream and average");
        LongStream longs2 = LongStream.range(5, 69);
        long sum = longs2.sum();
        System.out.println("sum of longs is: " + sum);

        DoubleStream doubles2 = DoubleStream.generate(() -> Math.PI).limit(9);
        OptionalDouble min = doubles2.min();
        System.out.println("min from double stream of PI is: " + min.getAsDouble());


    }
}
