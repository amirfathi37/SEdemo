import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class LambdasDemo {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        Consumer<Integer> consumer = System.out::println;
        Consumer<Integer> consumer1 = s -> System.out.println("hi " + s);
        Consumer<Integer> consumer2 = s -> System.out.println("bye " + s);

        list.forEach(consumer.andThen(consumer1).andThen(consumer2));

        list.forEach(integer -> System.out.println(integer + 2));
        List<Integer> list1 = new ArrayList<>();
        list.forEach(integer -> list1.add(integer));
        list1.forEach((Integer integer) -> System.out.println("list1 : " + integer));
        list.forEach(new ConsumerImplemention());
        list.forEach(integer -> System.out.println(integer));

        Supplier<Integer> supplier = () -> {
            return new Random().nextInt();
        };
        System.out.println(supplier.get());

        Function<String, Integer> map = s -> s.length();

        Function<String, String> first = s -> {
            return s.replace(":", "=");
        };
        Function<String, String> sec = s -> {
            return "{" + s + "}";
        };

        String result = first.andThen(sec).apply("name:amir");
        System.out.println(result);


        Predicate<Integer> lessThanThousend = value -> {
            return value <= 1000;
        };

        Predicate<Integer> moreThanThousend = value -> {
            return value > 1000;
        };


        System.out.println(lessThanThousend.negate().test(100));
        System.out.println(lessThanThousend.and(moreThanThousend).test(100));
        System.out.println(lessThanThousend.or(moreThanThousend).test(100));


        BinaryOperator<Integer> add = (integer, integer2) -> {
            return integer + integer2;
        };


        Integer apply = add.andThen(integer -> {
            return integer * 5;
        }).apply(1, 2);
        System.out.println(apply);
//        showGreet();
        BiFunction<Integer , Integer , String> function = (integer, integer2) -> {
            String returnValue = "";
          if(integer > 10 )
              return "first element is upper than 10";
            if(integer2 > 10 )
                return "second element is upper than 10";
            else
                return "Cant find any parameter upper than 10";
        };

        String apply1 = function.apply(9, 5);
        System.out.println(apply1);
    }

    /*************** Annonymos Class ***************/
    private static void showGreet() {
        greatPrint(new Printer() {
            private String name = "Hossein ";

            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        /*************** simple lambda expression ***************/
        greatPrint((message) -> {
            System.out.println("hello " + 1350);

        });

        /*************** create an object ***************/
        Printer printerCustom = (message) -> {
            System.out.println("hello " + 1376);
        };
        greatPrint(printerCustom);

        /*************** reference method ***************/
        System.out.println("/*************** reference method ***************/");
        //greatPrint(System.out::print);
        greatPrint(LambdasDemo::customMethod);
    }

    static ConsolePrinter customMethod(String s) {
//      System.out.println(message);
        return new ConsolePrinter();
    }

    private static void greatPrint(Printer printer) {
        printer.print("HELLO WORLD");
    }


}
