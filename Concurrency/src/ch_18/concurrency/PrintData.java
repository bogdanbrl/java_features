package ch_18.concurrency;

/**
 * @author Double "B"
 * @created 01/04/2021 - 11:59 AM
 * @project OCP_java
 */
public class PrintData implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<3; i++){
            System.out.println("Printing record: " + i);
        }
    }

    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
        (new Thread(new PrintData())).start();
        (new Thread(new PrintData())).start();
    }
}
