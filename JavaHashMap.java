import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        Map<String , Integer> students = new HashMap<>();
        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Harsh", 45);

        //key cannot be repeated
        //keys are unique
        //keys are belongs to the set and values are belongs to the list

        System.out.println(students);
        System.out.println(students.get("Kiran"));

        for(String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

        System.out.println(students.values());
        System.out.println(students.keySet());
        System.out.println(students.size());

        //if we are working with multiple threads we can use HashTable 
        //because HashTable is synchronized(the process that allows only one thread at a particular time to complete a given task entirely)
    }
}
