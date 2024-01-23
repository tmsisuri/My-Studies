class Calc{
    String name;
    public Calc(){
        System.out.println("Calculator for two numbers");
    }

    public int add(int n1 , int n2){
        System.out.println("in add method");
        return n1 + n2;
    }

    public int sub(int n1 , int n2){
        System.out.println("in sub method");
        return n1 - n2;
    }
}
class AdvCalc extends Calc{
    public AdvCalc(){
        super();
        System.out.println("Advanced calculator");
    }
    public int add(int n1 , int n2){
        super.name = " add ";
        super.add(n1, n2);
        return n1 + n2 + 10;
    }
}
public class SuperKeyWord {
    public static void main(String arg[]){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(23 , 45);
        System.out.println(r1);
        //super keyword can call variables, methods, constructor in superclass to the subclass
    } 
}
