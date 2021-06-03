package functionalProgramming.functionalInterfacesForPrimitives;

import java.util.function.*;

/**
 * @author Double "B"
 * @created 31/03/2021 - 12:46 PM
 * @project OCP_java
 */
public class MainFunctionalInterfacesForPrimitives {

    public static void main(String[] args) {

        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;

        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());

        DoubleSupplier doubleSupplier;
        IntSupplier intSupplier;
        LongSupplier longSupplier;

        DoubleConsumer doubleConsumer;
        IntConsumer intConsumer;
        LongConsumer longConsumer;

        /** etc. */

    }
}
