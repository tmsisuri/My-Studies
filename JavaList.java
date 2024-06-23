import java.util.Arrays;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,7,9,2,3,6,1,8);

        //print all values --> 1st method
        for(int i=0 ; i<nums.size() ; i++ ) {
            System.out.println(nums.get(i));
        }

        //print all values --> 2nd method
        for(int j : nums) {
            System.out.println(j);
        }

        //print all values --> 3rd method
        nums.forEach(n -> System.out.println(n));

    }
}
