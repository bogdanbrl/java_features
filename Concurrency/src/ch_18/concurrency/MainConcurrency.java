package ch_18.concurrency;

/**
 * @author Double "B"
 * @created 01/04/2021 - 11:53 AM
 * @project OCP_java
 */
public class MainConcurrency {

    public static void main(String[] args) {

        Runnable sloth = () -> System.out.println("Hello Bogdan");
        Runnable snake = () -> {
            System.out.println("snake");
            int i = 10; i++;
        };
        Runnable beaver = () -> {
            System.out.println("beaver return");
            return;
        };
        Runnable coyote = () -> {
            System.out.println("coyote");
        };


        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");

    }
}
