public class StarPatterns {
    public static void main(String arg[]){
        //pattern 1
        System.out.println("*");
        //pattern 2
        for(int i=0 ; i<=4 ; i++){
            System.out.print("*");
        }
        System.out.println();
        //pattern 3
        for(int x=0 ; x<=4 ; x++){
            for(int i=0 ; i<=4 ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 4
        for(int j=0 ; j<=4 ; j++){
            for(int i=0 ; i<=j ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 5
        for(int j=0 ; j<=5 ; j++){
            for(int k=4 ; k-j>=0 ; k--){
                System.out.print(" ");
            }
            for(int i=1 ; i<=j ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
