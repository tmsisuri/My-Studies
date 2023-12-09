public class Loop {
    public static void main(String arg[]){
       //while loop
       int i = 1;
       while (i <= 4) {
          System.out.println("Hi " + i);
          i++;   
       }
       System.out.println("Bye " + i);
       //nested while loop
       int I = 1;
        while (I <= 4) {
          System.out.println("Hi " + I);
          int j = 1;
          while (j <= 3) {
            System.out.println("Hello " + j); 
            j++;      
          }
          I++;   
       }
       System.out.println("Bye " + I);
       //do while loop
       int k = 6;
       do {
        System.out.println("Do");
        k++;
       } while (k <= 4);
       //for loop
       for(int a=1; a<=4; a++){
        System.out.println("day " + a);
       }
       //for loop 2nd method
       int d=1;
       for(;d<=4; ){
        System.out.println("day " + d);
        d++;
       }
         //nested for loop
        for(int b=1; b<=5; b++){
         System.out.println("day " + b);
         for(int c=1; c<=9; c++){
             System.out.println("   " + (c+8) + " - " + (c+9));
        }
       }
       //enhanced for loop
       int num[] = new int[4];
       num[0] = 4;
       num[1] = 6;
       num[2] = 2;
       num[3] = 8;
       for(int n : num){
         System.out.println(n);
       }
    }
    
}
