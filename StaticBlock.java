class Vehicles{
    String colour;
    int price;
    static String name;
    static{
        name = "car";
        System.out.println("in static block");
    }
    public Vehicles(){
        colour = "";
        price = 2000;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(name + " : " + colour + " : " + price);
    }
}
class StaticBlock {
    public static void main(String arg[]){
        Vehicles obj1 = new Vehicles();
        obj1.colour = "black";
        obj1.price = 2500;
        obj1.show();
        Vehicles obj2 = new Vehicles();
        obj2.show();
    }
}
