import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    public Stream<CompletableFuture<Quote>> getQuotes() {
        List<String> nameOfSites = Arrays.asList("AliBaba", "Flightio", "SnapTrip!");
        Stream<CompletableFuture<Quote>> completableFutureStream = nameOfSites.stream().map(FlightService::getQuote);
        return completableFutureStream;
    }


    public static CompletableFuture<Quote> getQuote(String site) {
        System.out.println("quoting ...");
        return CompletableFuture.supplyAsync(() -> {
            LonfTask.task();
            return new Quote(site, new Random().nextInt(10) + 100);
        });
    }

}
