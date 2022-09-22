//https://www.youtube.com/watch?v=6Oo-9Can3H8

public class BasicThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }

    static class Task implements Runnable{
        public void run(){
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
