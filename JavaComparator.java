import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
 
    //sort values based on your own logic
    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare(Integer i , Integer j) {
        if (i%10 > j%10)
            return 1;
        else if (i%10 < j%10)
            return -1;
        else
            return 0;
      }
    };
    List<Integer> nums2 = new ArrayList<>();
    nums2.add(43);  
    nums2.add(31);   
    nums2.add(72);   
    nums2.add(29);  

    Collections.sort(nums2, com);
    System.out.println(nums2);

  }
}
