import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }

    public int compareTo(Student that) {
    if (this.age > that.age)
        return 1;
    else 
        return -1;
    
    }
    
}
public class JavaComparable {
    public static void main(String[] args) {
        Comparator<Student> com = (i , j) -> i.age > j.age?1:-1;

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(21, "Navin"));
        stud.add(new Student(12, "John"));
        stud.add(new Student(18, "Parul"));
        stud.add(new Student(20, "Kiran"));
        
        //using Comparable
        Collections.sort(stud);

        for(Student s : stud) {
            System.out.println(s);
        }

        //using Comparator
        Collections.sort(stud, com);

        for(Student s : stud) {
            System.out.println(s);
        }
    }
}
