import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaHashSet {
    public static void main(String[] args) {

        //unique item collection
        Set<Integer> nums = new HashSet<>();
        nums.add(73);
        nums.add(45);
        nums.add(23);
        nums.add(92);
        nums.add(65);

        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();
        
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        //sorted item collection
        Set<Integer> num = new TreeSet<>();
        num.add(73);
        num.add(45);
        num.add(23);
        num.add(92);
        num.add(65);
        System.out.println(num);
        
    }
}
