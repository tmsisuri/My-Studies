import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = sc.nextInt();
        int count = 0;
        for(int x=2 ; x<=number/2 ; x++){
            if((number%x)==0){
                count++;
                break;
            }
        }
        if(count==0 && number!=1){
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
        sc.close();
    }
}

