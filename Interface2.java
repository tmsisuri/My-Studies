interface A {
    //all the variables in an interface are, by default, final and static
    int age = 23;
    String area = "Colombo";

    //all the methods in an interface are, by default, public and abstract
    void show(); 
    void config();
}
interface X {
    void run();
}
interface Y extends X {
    void play();
}
class B implements A,Y{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    public void run() {
        System.out.println("running....");
    }
    public void play() {
        System.out.println("playing....");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        //inheritance
        //class to class --> extends
        //class to interface --> implements
        //interface to interface --> extends

        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.area);

        X obj1 = new B();
        obj1.run();
    }
}
