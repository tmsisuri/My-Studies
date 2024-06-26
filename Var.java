class Car {
    String colour;
    int price;
}
public class Var {
    public static void main(String[] args) {
        //var is a keyword that allows you to declare a variable without specifying its type

        //The type of the variable is inferred from the context
        //The compiler determines the type of the variable based on the value it is initialized with

        //var can only be used within methods, initializers, or in the index variable of a for-each loop
        //It cannot be used for class fields, method parameters, or return types
        
        //You must initialize the variable at the time of declaration. This is necessary for the compiler to infer the type

        int i = 8;
        var j = 3;  //inferred as int
        var str = "Hello World!";  //inferred as String

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        int nums1[] = new int[4];
        nums1[0] = 4;
        var nums2 = new int[4];  //inferred as ArrayList<Integer>
        nums2[0] = 6;

        Car c = new Car();
        c.colour = "White";
        var c1 = new Car();
        c1.colour = "Black";
    }
}
