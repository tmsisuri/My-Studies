import java.util.Scanner;

public class PrimeNumbers2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = sc.nextInt();
        int count = 0;
        for(int n=1 ; n<=number ; n++){
            for (int x=2; x<=n/2; x++) {
                if ((n%x)==0) {
                    count++;
                    break;
                }
                count = 0;
            }
            if(count==0 && n!=1) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}

