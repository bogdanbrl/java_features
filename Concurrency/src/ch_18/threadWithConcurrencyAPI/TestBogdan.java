package ch_18.threadWithConcurrencyAPI;

import OCP_part2.ch_18.concurrency.PrintData;
import OCP_part2.ch_18.concurrency.ReadInventoryThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Double "B"
 * @created 01/04/2021 - 12:27 PM
 * @project OCP_java
 */
public class TestBogdan {

    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            service.execute(new Thread(new PrintData()));
            service.execute(new ReadInventoryThread());
            service.execute(new ReadInventoryThread());
            service.execute(new Thread(new PrintData()));

        }finally {
            if(service != null){
                service.shutdown();
                //service.shutdownNow();
            }
            if(service == null){
                System.out.println("Service was shout down!");
            }else {
                System.out.println("Service cannot be shot down!");
            }
        }

    }
}
