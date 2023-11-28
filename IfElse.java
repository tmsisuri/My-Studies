class IfElse {
    public static void main(String arg[]){
        //if 
        int x = 15;
        int y = 7;
        int z = 23;
        if( x > 10 )
        System.out.println(x);
        //if else
        if( x < y )
        System.out.println(y);
        else{
            System.out.println(x);
            System.out.println("x > y");
            //if there is more than 1 statment in if else then put {}
        }
        //if else if
        if (x>y && x>z)
        System.out.println(x);
        else if ( y > z )
        System.out.println(y);
        else
        System.out.println(z);
        //ternary operator (shortcut for if else)  (? :)
        int a = 6;
        int result = 3;
        /* if( a % 2 == 0 )
           result = 10;
           else
           result = 20;
        */
        result = a%2 == 0 ? 10 : 20;
        System.out.println(result);

    }
}
