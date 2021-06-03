package ch_18.concurrency;

/**
 * @author Double "B"
 * @created 01/04/2021 - 12:15 PM
 * @project OCP_java
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 50000000; i++) CheckResults.counter++;
        }).start();

        while (CheckResults.counter < 40000000){
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached!");
    }
}
