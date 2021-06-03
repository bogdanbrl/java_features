import comparators.*;
import model.CreateMapWithListOfLongsAsValues;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 6:55 PM
 * @project SortMapWithListOfLongsAsValues
 */
public class MainSortMapWithListOfLongsAsValues {

    public static void main(String[] args) {
        CreateMapWithListOfLongsAsValues map = new CreateMapWithListOfLongsAsValues();

        printMap(map.getMapWithListOfLongsAsValues());

        System.out.println("");

        System.out.println("Sort after first value: ");
        Stream<Map.Entry<Integer, LinkedList<Long>>> s1 = map.getMapWithListOfLongsAsValues().entrySet().stream()
                .sorted(new SortAfter_firstValue<>());
        printStream(s1);

        System.out.println("Sort after second value: ");
        Stream<Map.Entry<Integer, LinkedList<Long>>> s2 = map.getMapWithListOfLongsAsValues().entrySet().stream()
                .sorted(new SortAfter_secondValue<>());
        printStream(s2);

        System.out.println("Sort after third value: ");
        Stream<Map.Entry<Integer, LinkedList<Long>>> s3 = map.getMapWithListOfLongsAsValues().entrySet().stream()
                .sorted(new SortAfter_thirdValue<>());
        printStream(s3);

        System.out.println("Sort after forth value: ");
        Stream<Map.Entry<Integer, LinkedList<Long>>> s4 = map.getMapWithListOfLongsAsValues().entrySet().stream()
                .sorted(new SortAfter_forthValue<>());
        printStream(s4);

        System.out.println("Sort after fifth value: ");
        Stream<Map.Entry<Integer, LinkedList<Long>>> s5 = map.getMapWithListOfLongsAsValues().entrySet().stream()
                .sorted(new SortAfter_fifthValue<>());
        printStream(s5);


        System.out.println("------testing-------");
        Map<Integer, LinkedList<Long>> m = map.getMapWithListOfLongsAsValues().entrySet().stream()
                .sorted(new SortAfter_fifthValue<>()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        printMap(m);



    }

    private static void printMap(Map<Integer, LinkedList<Long>> map) {
        map.forEach((k, v) -> {
            System.out.print("Key " + k + ": {");
            v.forEach(i -> {
                System.out.print(" " + i);
            });
            System.out.println(" }");
        });
    }

    private static void printStream(Stream<Map.Entry<Integer, LinkedList<Long>>> stream) {
        stream.forEach(s -> System.out.println(s));
        System.out.println("");
    }

//    private static <T> Stream<T> reverse(Stream<T> stream){
//
//    }
}
