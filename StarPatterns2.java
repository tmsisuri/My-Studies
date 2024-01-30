public class StarPatterns2 {
    public static void main(String arg[]){
        for(int i=0 ; i<=4 ; i++){
            for(int j=4 ; j-i>=0 ; j--){
                System.out.print(" ");
            }
            for(int k=0 ; k<=i ; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0 ; i<=4 ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }
            for(int k=i ; k<=4 ; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0 ; i<=4 ; i++){
            for(int j=4 ; j-i>=0 ; j--){
                System.out.print(" ");
            }
            for(int k=0 ; k<=(i*2) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=4 ; i>=0 ; i--){
            for(int j=4 ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int k=0 ; k<=(i*2) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
