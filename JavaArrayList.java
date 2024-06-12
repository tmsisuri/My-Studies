import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(3);

        //Print all values
        System.out.println(nums);

        for(int n : nums) {
            System.out.println(n);
        }

        //ArrayList Size
        System.out.println(nums.size());
        //Access an Item
        System.out.println(nums.get(3));
        //Get an Item index
        System.out.println(nums.indexOf(7));
        //Change an Item
        nums.set(4, 10);
        System.out.println(nums.get(4));
        //Remove an Item
        nums.remove(2);
        System.out.println(nums);
        //Remove all the elements
        nums.clear();
        System.out.println(nums);


    }
}
