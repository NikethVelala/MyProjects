//https://www.youtube.com/watch?v=ImtZgX1nmr8

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            CompletableFuture.supplyAsync(() -> getOrder())
                    .thenApply(order -> enrich(order))
                    .thenApply(order -> payment(order))
                    /*if exception has occured
                    .exceptionally(e->new FailedOrder())*/
                    .thenAccept(order -> sendEmail(order));
        }
    }

    public static void sendEmail(Object order) {
        System.out.println("send mail to order number: "+order);
    }

    public static int payment(Integer order) {
        return order*1;
    }

    public static int enrich(Integer order) {
        return order*1;
    }

    public static int getOrder() {
        return 1;
    }
}
