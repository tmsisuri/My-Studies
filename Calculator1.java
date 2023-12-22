import java.util.Scanner;
class Calculator1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3-Multiply");
        System.out.println("4-Divide");
        System.out.println("Choose operator : ");
        int operator = sc.nextInt();
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int n3 = sc.nextInt();
        int result = 0;
        switch (operator) {
            case 1:
            result = n1 + n2 + n3;
            break;
            case 2:
            result = n1 - n2 - n3;                
            break;
            case 3:
            result = n1 * n2 * n3;
            break;
            case 4:
            result = n1 / n2 / n3;
            break;
            default:
            System.out.println("Invelid operator");  
        }
        System.out.println(result);
        sc.close();
    }
}
