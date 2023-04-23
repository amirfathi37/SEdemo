import java.util.Scanner;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class ExcuterDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        try {
//            executorService.submit(() -> {
//                System.out.println(Thread.currentThread().getName() + "reza");
//            });
//            executorService.submit(() -> {
//                System.out.println(Thread.currentThread().getName() + "amir");
//                try {
//                    Thread.currentThread().sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "amir done");
//            });
//            executorService.submit(() -> {
//                System.out.println(Thread.currentThread().getName() + "fathi");
//            });
//            executorService.submit(() -> {
//                System.out.println(Thread.currentThread().getName() + "ahar");
//            });
//        } finally {
//            executorService.shutdown();
//        }
//

//        ExecutorService service = Executors.newFixedThreadPool(2);
//        Future<Integer> res = service.submit(() -> {
//            System.out.println("long task started");
//            LongTask.longTask();
//            System.out.println("long task is done");
//            return 1;
//        });
//        System.out.println("we are waiting ....");
//        Integer integer = res.get();
//        System.out.println(integer);

        ExecutorService executorSRV = Executors.newFixedThreadPool(2);
        Future<?> unKnown = executorSRV.submit(() -> System.out.println("salam"));
        Future<Integer> value = executorSRV.submit(() -> 1);
        Integer intValue = value.get();
        System.out.println(intValue);
        CompletableFuture.supplyAsync(() -> 1);

//        LongTask.longTaskASync4();
//
//        Thread.sleep(10000);

    }
}
