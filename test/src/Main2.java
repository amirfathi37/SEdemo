import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.forEach(System.out::println);
//        Consumer<String> consumer = System.out::println;
//        consumer.accept("amir");
        Function<String, String> function1 = s -> s.replace(":", "=");
        Function<String, String> function2 = s -> "{" + s + "}";

        String str = function1.compose(function2).apply("A : B");
        System.out.println(str);
        Predicate<String> stringPredicate1 = s -> !s.isEmpty();
        Predicate<String> stringPredicate2 = s -> s.length() >    5;
        boolean sky = stringPredicate1.and(stringPredicate2).test("mySkys");
        System.out.println(sky);

       }

}
