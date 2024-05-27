@FunctionalInterface
interface A {
    int add(int i , int j);
}
public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        /* 
        without Lambda Expression
        A obj = new A() {
            public int add(int i , int j) {
                return i+j;
            }
        };
        */

        //with Lambda Expression
        A obj = (i,j) -> i+j;
        int result = obj.add(7, 3);
        System.out.println(result);
    }
}
