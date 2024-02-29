class A{
    //we can't create static outer class but we can create static inner class
    int price;
    public void show(){
        System.out.println("in show");
    }

    //non-static inner class
    class B{
        String name;
        public void config(){
            System.out.println("in config");
        }
    }

    //static inner class
    static class C{
        int count;
        public void write(){
            System.out.println("in write");
        }
    }
}

public class InnerClass {
    public static void main(String arg[]){
        A obj1 = new A();
        obj1.show();

        //to create an object in non-static inner class we need to create an outer class object first (obj1.new B())
        /*if you want to create a object of non-static inner class you need to first specify where it belongs to(A.B) and then you need a
        object of outer class to create a object of inner class(obj1.new B()) */
        A.B obj2 = obj1.new B();
        obj2.config();
        obj2.name = "food";

        //we can create static inner class object without outer class object
        //we can directly create a object of static inner class without a outer class object
        /*if you want to create a object of static inner class you need to first specify where it belongs to(A.C) and then 
        you can directly create a object of static inner class without a outer class object (new A.C()) */
        A.C obj3 = new A.C();
        obj3.write();
        obj3.count = 15;
    }
}
