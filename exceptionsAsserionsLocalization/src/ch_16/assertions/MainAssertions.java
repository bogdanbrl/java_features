package ch_16.assertions;

/**
 * @author Double "B"
 * @created 31/03/2021 - 6:25 PM
 * @project OCP_java
 */
public class MainAssertions {


    public static void main(String[] args) {

        /** run from terminal as: java -ea MainAssertions.java
         * to activate assertions
         */

        int age = 10;
        assert 1 == age : "problem";

        System.out.println(age);
    }
}
