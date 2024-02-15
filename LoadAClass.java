class Mobile{
    int price;
    String brand;
    static String name;

    static{
        System.out.println("in static block");
    }
    
    public void show(){
        System.out.println(name + " : " + brand + " : " + price);
    }
}
public class LoadAClass {
    public static void main(String arg[]) throws ClassNotFoundException{
        //to load a class
        Class.forName("Mobile");
        //every time the class is load it will call the static block
        //static block only call once
    }
}
