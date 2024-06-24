import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,7,2,5,8,3,6,1);

        // int sum = 0;
        // for(int n : nums) {
        //     if(n%2 == 0) {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 ==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result1 = s3.reduce(0,(c,e) -> c+e);

        System.out.println(result1);

        //with lambda Expression
        int result2 = nums.stream()
                         .filter(n -> n%2 ==0)
                         .map(n -> n*2)
                         .reduce(0, (c,e) -> c+e);

        System.out.println(result2);

    }
}
