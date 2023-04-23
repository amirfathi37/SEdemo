import java.util.function.Consumer;

public class
ConsumerImplemention implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer.toString());

    }

}
