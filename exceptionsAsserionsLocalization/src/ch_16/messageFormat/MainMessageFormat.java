package ch_16.messageFormat;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author Double "B"
 * @created 01/04/2021 - 11:05 AM
 * @project OCP_java
 */
public class MainMessageFormat {

    public static void main(String[] args) {

        Locale locale = new Locale("ro", "RO");
        ResourceBundle rb = ResourceBundle.getBundle("zoo", locale);

        String string = rb.getString("helloByName");
        System.out.println(MessageFormat.format(string, "Bogdan", "Voda"));

        System.out.println("\n\n\nUsing properties class");
        var props = new Properties();
        props.setProperty("name","Our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel", "Bob"));
        System.out.println(props.getProperty("name"));


    }
}
