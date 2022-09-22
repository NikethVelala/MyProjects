import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //create the pool
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        //submit the tasks for execution
        List<Future> allFutures = new ArrayList<>();
        for(int i=0;i<100;i++){
            Future<Integer> future = service.submit(new Task());
            allFutures.add(future);
        }

        //you can perform some unrelated operations

        for(int i=0;i<100;i++){
            Future<Integer> future =allFutures.get(i);
            Integer result = null; //blocking
            try {
                result = future.get(1, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                System.out.println("Couldn't complete task before timeout");
                e.printStackTrace();
            }
            System.out.println("Result of future #" + i + "=" + result);
        }

        System.out.println("Thread Name: "+ Thread.currentThread().getName());
    }

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }
}
