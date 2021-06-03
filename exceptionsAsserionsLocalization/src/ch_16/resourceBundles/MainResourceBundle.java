package ch_16.resourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Double "B"
 * @created 31/03/2021 - 8:23 PM
 * @project OCP_java
 */
public class MainResourceBundle {

    public static void main(String[] args) {

        /** for this we need a resource properties file in resources */

        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");

        System.out.println("\n\n\nprint using resource bundle");
        printWelcomeMessage(us);
        printWelcomeMessage(frenchCanada);
        printWelcomeMessage(new Locale("ro", "RO"));

        ResourceBundle rb = ResourceBundle.getBundle("zoo", us);
        rb.keySet().stream()
                .map(k -> k + ": " + rb.getString(k))
                .forEach(System.out::println);

    }

    private static void printWelcomeMessage(Locale locale){
        var rb = ResourceBundle.getBundle("zoo", locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }
}
