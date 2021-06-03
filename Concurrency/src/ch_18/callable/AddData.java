package ch_18.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Double "B"
 * @created 01/04/2021 - 1:05 PM
 * @project OCP_java
 */
public class AddData {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());
        }finally {
            if (service!=null) service.shutdown();
        }
    }
}
