package ch_18.concurrency;

/**
 * @author Double "B"
 * @created 01/04/2021 - 12:04 PM
 * @project OCP_java
 */
public class ReadInventoryThread extends Thread{
    @Override
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
        (new ReadInventoryThread()).start();
        (new ReadInventoryThread()).start();
    }
}
