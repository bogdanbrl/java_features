package ch_16.datesAndTime;

import java.time.*;

/**
 * @author Double "B"
 * @created 31/03/2021 - 6:38 PM
 * @project OCP_java
 */
public class MainDateAndTime {

    public static void main(String[] args) {

        System.out.println("LocalDate: " +LocalDate.now());
        System.out.println("LocalTime: " +LocalTime.now());
        System.out.println("LocalDateTime: " +LocalDateTime.now());
        System.out.println("ZonedDateTime: " +ZonedDateTime.now());

        LocalDate date = LocalDate.of(2021, Month.MARCH, 31);
        LocalTime time = LocalTime.of(18, 50, 00);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);


    }
}
