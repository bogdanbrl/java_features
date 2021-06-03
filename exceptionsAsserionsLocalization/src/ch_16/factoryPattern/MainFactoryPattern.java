package ch_16.factoryPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Double "B"
 * @created 31/03/2021 - 6:51 PM
 * @project OCP_java
 */
public class MainFactoryPattern {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.MARCH, 31);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        LocalTime time = LocalTime.of(18, 50, 06);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dateTime.format(f));

        System.out.println("\n\n\nDate and simpleDateFormat classes");
        DateFormat s = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(s.format(new Date()));

        System.out.println("\n\ntests with dates and times");
        var dt = LocalDateTime.of(2021, Month.MARCH, 31, 18, 55, 59);
        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1));

        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2));

        ZonedDateTime zdt = ZonedDateTime.of(date, time, ZoneId.of("GMT+05:30"));
        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
        System.out.println(zdt.format(formatter3));
    }
}
