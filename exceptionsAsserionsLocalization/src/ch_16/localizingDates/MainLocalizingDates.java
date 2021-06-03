package ch_16.localizingDates;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Double "B"
 * @created 31/03/2021 - 7:47 PM
 * @project OCP_java
 */
public class MainLocalizingDates {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dft = LocalDateTime.of(2021, Month.MARCH, 31, 19,51,31);
//        print(DateTimeFormatter.ofLocalizedDate(), dft, italy);
    }

    private static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale){
        System.out.println(dtf.format(dateTime) + ", "
                + dtf.withLocale(locale).format(dateTime));
    }
}
