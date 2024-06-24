import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachAndConsumer {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,6,5,2,8,7,4);

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        nums.forEach(con);

        //with lambda Expression
        Consumer<Integer> consumer = n -> System.out.println(n);
        nums.forEach(consumer);

        //without creating consumer object
        nums.forEach(x -> System.out.println(x));
    }
}
