class Operators{
    public static void main(String arg[]){
        //arithmetic operators
        int x = 24;
        int y = 7;
        int result1 = x + y;
        System.out.println(result1);
        int result2 = x - y;
        System.out.println(result2);
        int result3 = x * y;
        System.out.println(result3);
        int result4 = x / y;
        System.out.println(result4);
        //modulus operator
        int result5 = x % y; //( % = remainder)
        System.out.println(result5);
        //compound assignment operators
        int a = 8;
        a += 3; //(a = a +3)
        System.out.println(a);
        a -= 4; //(a = a - 4)
        System.out.println(a);
        a *= 2; //(a = a * 2)
        System.out.println(a);
        a /= 5; //(a = a / 5)
        System.out.println(a);
        a %= 6; //(a = a % 6)
        System.out.println(a);
        //increment
        //postincrement
        int b = 6;
        System.out.println(b++);
        int b1 = 2;
        b1++;
        System.out.println(b1);
        //preincrement
        int c = 4;
        ++c;
        System.out.println(c);
        //decrement
        //postdecrement
        int d = 3;
        System.out.println(d--);
        int d1 = 9;
        d1--;
        System.out.println(d1);
        //predecrement
        int e = 7;
        --e;
        System.out.println(e);
        //relational operators
        int g = 27;
        int h = 18;
        boolean result6 = g == h;
        System.out.println(result6);
        boolean result7 = g != h;
        System.out.println(result7);
        boolean result8 = g > h;
        System.out.println(result8);
        boolean result9 = g < h;
        System.out.println(result9);
        boolean result10 = g >= h;
        System.out.println(result10);
        boolean result11 = g <= h;
        System.out.println(result11);
        //logical operators (AND = & , OR = | , NOT = !)
        int q = 56;
        int r = 34;
        int k = 24;
        int m = 13;
        boolean RESULT1 = q < r && k > m;
        System.out.println(RESULT1);
        boolean RESULT2 = q > r || k == m;
        System.out.println(RESULT2);
        boolean RESULT3 = q < r && k < m && m > 15;
        System.out.println(RESULT3);
        System.out.println(!RESULT3);
    }
}