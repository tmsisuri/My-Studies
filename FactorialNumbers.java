import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int result = 1;
        for(int count=1 ; count<=n ; count++){
            result = result * count;   
        }
        System.out.println(result);
        sc.close();
    }    
}
