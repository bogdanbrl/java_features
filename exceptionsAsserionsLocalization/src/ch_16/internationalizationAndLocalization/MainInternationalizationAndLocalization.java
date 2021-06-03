package ch_16.internationalizationAndLocalization;

import java.util.Locale;

/**
 * @author Double "B"
 * @created 31/03/2021 - 7:14 PM
 * @project OCP_java
 */
public class MainInternationalizationAndLocalization {

    public static void main(String[] args) {
         /** need strings in a properties file and ensure the proper data formatters so it can be adapted */
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        System.out.println(new Locale("ro"));
        System.out.println(new Locale("ro", "MD"));

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l1);


    }
}
