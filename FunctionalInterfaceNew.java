@FunctionalInterface
interface A {
    public abstract void show();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("in show");
    }
}

public class FunctionalInterfaceNew {
    public static void main(String[] args) {
        //a functional interface contains a single abstract method
        A obj1 = new A() {
            public void show() {
                 System.out.println(" in new show");
            }
        };
        obj1.show();

        A obj2 = new B();
        obj2.show();
    }
}
