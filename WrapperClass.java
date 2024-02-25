public class WrapperClass {
    public static void main(String arg[]){
        //autoboxing
        int num1 = 7;
        Integer num2 = num1;
        System.out.println(num2);

        //autoboxing example
        double d1 = 3.542;
        Double d2 = d1;
        System.out.println(d2);

        //autoboxing example
        char c1 = 'k';
        Character c2 = c1;
        System.out.println(c2);

        //auto-unboxing
        int num3 = num2; 
        System.out.println(num3);

        //auto-unboxing example
        double d3 = d2;
        System.out.println(d3);

        //auto-unboxing example
        char c3 = c2;
        System.out.println(c3);
        
        //String to int
        String str = "34";
        int num4 = Integer.parseInt(str);
        System.out.println(num4 * 2);

    }
}
