class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class Polymorphism {
    public static void main(String arg[]){
        //polymorphism types
        // 1-compile time polymorphism (method overloding)
        // 2-run time polymorphism (method overriding) dynamic method dispatch
        A obj1 = new B();
        obj1.show();

        A obj2 = new C();
        obj2.show();
    }
}
