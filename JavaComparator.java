import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaComparator {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(4);  
    nums.add(3);   
    nums.add(7);   
    nums.add(9);  

    //The sort() method sorts an array in ascending order
    //This method sorts arrays of strings alphabetically, and arrays of integers numerically
    Collections.sort(nums);
    System.out.println(nums);
 
  }
}
