import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LongTask {
    public static void longTask() {
        try {
            System.out.println("task was started.");
            Thread.sleep(5000);
            System.out.println("task is done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void longTaskASync() throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(LongTask::longTask);
        Future<Integer> submit = Executors.newFixedThreadPool(5).submit(() -> 1);
        Integer integer = submit.get();

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> 1);
        Integer integer1 = integerCompletableFuture.get();


    }

    public static void longTaskASync2() throws ExecutionException, InterruptedException {

        CompletableFuture<Object> res = CompletableFuture.supplyAsync(() -> {
            System.out.println("getting the current weather ... ");
            throw new IllegalStateException("ridi");
        });
        Object o = res.exceptionally(throwable -> 1).get();

    }

    public static void longTaskASync3() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 20);
        Integer res = future.thenApply(LongTask::convertCToF).get();
        System.out.println(res);
    }

    private static int convertCToF(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void longTaskASync4() {

        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> "20USD")
                .thenApply(s -> Integer.valueOf(s.replace("USD", "")));
        CompletableFuture<Double> second = CompletableFuture.supplyAsync(() -> 0.9);

        first.thenCombine(second, (price, exchangeRank) -> price * exchangeRank)
                .thenAccept(result -> System.out.println(result));

    }
}