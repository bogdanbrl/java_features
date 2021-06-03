package ro.sda;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Michael", "Andrew", "Brandon");

        List<String> namesStartingWithB = names.stream() // Start stream (list becomes a stream)
                .filter(name -> name.startsWith("B")) // stream is still a stream, but only contains values starting with B
                .collect(Collectors.toList()); // convert stream to list

        System.out.println(namesStartingWithB);

        List<Integer> namesLength = names.stream() // Start stream (list becomes a stream)
                .filter(Main::nameTester) // filter extracted in outside method
                .map(String::length) // at this point, the streams values are transformed to whatever name.length() returns
                .collect(Collectors.toList()); // convert stream to list

        System.out.println(namesLength);

        // we create an optional containing a String value
        Optional<String> optString = Optional.of("Brandon");

        // if the value exists in the optional, we assign it to existingString, if not we throw an exception
        String existingString = optString.orElseThrow(() -> new RuntimeException());
        // if optional value exists, we get it and print it.
        if (optString.isPresent()) {
            System.out.println(optString.get());
        }

        // We can easily throw an exception if optional doesn't contain a value
//        Optional<String> optStringEmpty = Optional.empty();
//        String optContent = optStringEmpty.orElseThrow(() -> new RuntimeException());

        // print true if any value in stream matches the nameTester constraint
        System.out.println(names.stream().anyMatch(Main::nameTester));

        // print true if all values in stream match the nameTester constraint
        System.out.println(names.stream().allMatch(Main::nameTester));

        // iterate over all elements and execute some code (in this case print them)
        names.forEach(System.out::println);

        //the steam sorts the strings naturally (alphabetically)
        names.stream().sorted().forEach(System.out::println);

        System.out.println("-----------");

        //the steam sorts the strings in reverse order
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("-----------");
        //add people to a list
        List<Person> people = Arrays.asList(new Person("Andrei", "Marcu", 25),
                new Person("Raluca", "Popescu", 23),
                new Person("Mihnea", "Ionita", 29));

        //sort the people in the list by age and store it in a new list
        List<Person> peopleSorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        // print all first names of people previously sorted
        peopleSorted.stream().map(Person::getFirstName).forEach(System.out::println);

        System.out.println("-----------");
        List<Integer> integers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        // print all values greater than 30 and smaller than 200, sorted
        integers.stream().filter(i -> i > 30 && i < 200).sorted().forEach(System.out::println);

        System.out.println("-----------");
        // print all last names of people in uppercase
        people.stream().map(p -> p.getLastName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("-----------");
        // print all sorted last names of people,excluding the first and last characters of all last names
        people.stream().map(p -> p.getLastName().substring(1, p.getLastName().length() - 1))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------");
        // average the age of the people, stored in an optinal.
        OptionalDouble optionalDouble = people.stream().mapToInt(Person::getAge).average();
        // if an average is present, store it in toLaterUse, if not store the value of 0
        Double toLaterUse = optionalDouble.orElse(0);
        // if an averaga is present, print it. If not, do nothing
        optionalDouble.ifPresent(System.out::println);

    }

    private static boolean nameTester(String name) {
        return name.startsWith("A");
    }
}
