package ch_18.concurrency;

import java.util.concurrent.*;

/**
 * @author Double "B"
 * @created 01/04/2021 - 12:58 PM
 * @project OCP_java
 */
public class CheckResultWithFuture {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i<500; i++) CheckResultWithFuture.counter++;
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        }catch (TimeoutException e){
            System.out.println("Not reached in time!");
        }finally {
            if (service!=null) service.shutdown();
        }

    }
}
