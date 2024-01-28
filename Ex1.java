import java.util.Scanner;
public class Ex1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input temp in fahrenheit : ");
        float f = sc.nextInt();
        float c = (5 * (f - 32)) / 9;
        System.out.println("temp in Celcius : " + c);
        sc.close();
    }
}
