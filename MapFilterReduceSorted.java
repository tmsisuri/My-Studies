import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,8,7,2,1,3,5,6);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n%2 == 0;
            }  
        };

        //with lambda Expression
        //Predicate<Integer> p =  n -> n%2 == 0;  
        
        Function<Integer , Integer> f = new Function<Integer,Integer>() {
            public Integer apply(Integer n) {
                return n*2;
            } 
        };

        //with lambda Expression
        //Function<Integer , Integer> f = n -> n*2;

        int result1 = nums.stream()
                         .filter(p)
                         .map(f)
                         .reduce(0, (c,e) -> c+e); //(0 is the initial value , c is carrying number and e is element)
        
        System.out.println(result1);

        int result2 = nums.stream()
                         .filter(n -> n%2 == 0)
                         .map(n -> n*2)
                         .reduce(0, (c,e) -> c+e);

        System.out.println(result2);

        Stream<Integer> sortedValues = nums.stream()
                         .filter(n -> n%2 == 0)
                         .sorted();

        sortedValues.forEach(n -> System.out.println(n));

    }
}
