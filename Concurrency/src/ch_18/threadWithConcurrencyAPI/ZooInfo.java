package ch_18.threadWithConcurrencyAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Double "B"
 * @created 01/04/2021 - 12:21 PM
 * @project OCP_java
 */
public class ZooInfo {

    public static void main(String[] args) {
        ExecutorService service = null;
        Runnable task1 = () -> System.out.println("Printing zoo inventory");
        Runnable task2 = () -> {for (int i = 0; i < 3; i++) System.out.println("Printing record: " + i);};

        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
            System.out.println("end");
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
