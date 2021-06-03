package ch_16.formatNumbersAndCurrency;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Double "B"
 * @created 31/03/2021 - 7:26 PM
 * @project OCP_java
 */
public class MainCurrency {

    public static void main(String[] args) throws ParseException {

        int attendeesPerYear = 3_000_000;
        int attendeesPerMonth = attendeesPerYear/12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));

        var ca = NumberFormat.getInstance(Locale.CANADA);
        System.out.println(ca.format(attendeesPerMonth));

        //Locale.setDefault(Locale.FRANCE);

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));

        System.out.println("€");

        System.out.println("\n\n\n\nParsing numbers -- ParseException");
        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(en.parse(s));
        System.out.println(fr.parse(s));

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(); //currently set on US
        double value = (Double) cf.parse(income);
        System.out.println(value);

        System.out.println("\n\n\n decimal format symbols");
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("####,###,###.0");
        System.out.println(f1.format(d));

        NumberFormat f2 = new DecimalFormat("000,000,000.0000");
        System.out.println(f2.format(d));

        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d));



    }
}
