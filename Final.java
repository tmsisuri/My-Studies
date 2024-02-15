final class BasicCalc{
    public void add(int n1 ,  int n2){
        System.out.println(n1 + n2);
    }
}
class Calc{
    public final void show(){
        System.out.println("in Calc show");
    }
    public void sub(int n1 , int n2){
        System.out.println(n1 - n2);
    }
}
class AdvCalc extends Calc{
    public void div(int n1 , int n2){
        System.out.println(n1 / n2);
    }
}
public class Final {
    public static void main(String arg[]){
        //final keyword (variabel , method , class)
        //final variabel - once we assign the value it can't be change
        //final method - final method use to stop method overriding
        //final class - final class use to stop inheritance (can't extends)
        final int N1 = 4;
        System.out.println(N1);
        AdvCalc obj1 = new AdvCalc();
        obj1.sub(8, 2);
        obj1.show();
    }
}
