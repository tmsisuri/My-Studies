import java.util.Scanner;

class Methods{
    double n1;
    double n2;
    double result;
    String operator;
    Scanner sc;

    public Methods(){
        this.n1 = 0;
        this.n2 = 0;
        this.result = 0;
        this.operator = "NA";
    }

    public void getUserInput(){
        sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        n1 = sc.nextDouble();
        System.out.print("Input second number : ");
        n2 = sc.nextDouble();
        System.out.print("Input operator");
        operator = sc.next();
    }

    public void display(){
        System.out.println(n1 + " " + operator + " " + n2 + " = " + result);
    }
    public void Add(){
        result = n1 + n2;
    }
    public void Subtract(){
        result = n1 - n2;
    }
    public void Multiply(){
        result = n1 * n2;
    }
    public void Divide(){
        result = n1 / n2;
    }
}
public class Calculator2 {
    public static void main(String arg[]){
        Methods methods = new Methods();
        methods.getUserInput();
        if(methods.operator.contains("+")){
            methods.Add();
        }
        else if(methods.operator.contains("-")){
            methods.Subtract();
        }
        else if(methods.operator.contains("*")){
            methods.Multiply();
        }
        else if(methods.operator.contains("/")){
            methods.Divide();
        }
        else{
            System.out.println("Invalid operation");
        }
        methods.display();
    }
}
