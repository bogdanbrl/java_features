package functionalProgramming.optional;

import java.util.Optional;

/**
 * @author Double "B"
 * @created 30/03/2021 - 12:39 PM
 * @project OCP_java
 */
public class optional {

    /** An Optional is created using a factory.
     * You can either request an empty Optional or pass a value for the Optional to wrap.
     * Think of an Optional as a box that might have something in it or might instead be empty
     * */

    public static void main(String[] args) {
        System.out.println(average(90, 100));
        System.out.println(average());

        Optional<Double> opt = average();
        if (opt.isPresent()) System.out.println(opt.get());


        Optional o = (opt == null) ? Optional.empty() : Optional.of(opt);
        System.out.println("with ternary operator:     " + o.get());
        //similar to:
        Optional o2 = Optional.ofNullable(opt);
        System.out.println("with common pattern:     " + o.get());

        Optional<Double> opt2 = average(90, 100);
        opt2.ifPresent(System.out::println);

        /** Dealing with an Empty Optional

         The remaining methods allow you to specify what to do if a value isn't present.
         There are a few choices.
         The first two allow you to specify a return value either directly or using a Supplier.
         */

        Optional<Double> opt3 = average();
        System.out.println(opt3.orElse(Double.NaN));
        System.out.println(opt3.orElseGet(() -> Math.random()));
        //System.out.println(opt3.orElseThrow());
        System.out.println(opt3.orElseThrow(() -> new IllegalStateException()));


        /**
         * Is Optional the Same as null?
         * Before Java 8, programmers would return null instead of Optional.
         * There were a few shortcomings with this approach.
         * One was that there wasn't a clear way to express that null might be a special value.
         * By contrast, returning an Optional is a clear statement in the API that there might not be a value in there.
         * Another advantage of Optional is that you can use a functional programming style with ifPresent()
         * and the other methods rather than needing an if statement.
         * Finally, you'll see toward the end of the chapter that you can chain Optional calls.
         * */
    }

    private static Optional<Double> average(int... scores){
        if(scores.length==0) return Optional.empty();

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum/scores.length);
    }
}
