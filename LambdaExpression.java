@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void write(int i);
}

public class LambdaExpression {
    public static void main(String[] args) {
        //Lambda Expression
        A obj1 = () -> System.out.println("in show");
        obj1.show();

        //Lambda Expression with parameters
        B obj2 = i -> System.out.println("in write " + i);
        obj2.write(2);
    }
}
