//https://www.youtube.com/watch?v=6Oo-9Can3H8

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        //gets the number of available cores of this laptop
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        //submit the tasks for execution
        for(int i=0;i<20;i++){
            service.execute(new CpuIntensiveTask());
        }
        System.out.println("Thread Name: "+ Thread.currentThread().getName());
    }
    static class CpuIntensiveTask implements Runnable{
        public void run(){
            System.out.println("Thread Name: "+Thread.currentThread().getName());
        }
    }
}
