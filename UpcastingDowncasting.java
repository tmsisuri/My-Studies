class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}
public class UpcastingDowncasting {
    public static void main(String arg[]){
        //Upcasting
        A obj1 = new B();
        obj1.show1();

        //Downcasting
        B obj2 =(B) obj1;
        obj2.show2();
    }
}
