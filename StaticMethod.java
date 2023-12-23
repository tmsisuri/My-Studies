class Food{
    String name;
    static String size;
    int price;
    public static void show(Food obj){
        System.out.println(obj.name + " : " + size + " : " + obj.price);
    }
}
class StaticMethod {
    public static void main(String arg[]){
        Food obj1 = new Food();
        obj1.name = "pizza";
        Food.size = "small";
        obj1.price = 850;
        Food obj2 =new Food();
        obj2.name = "burger";
        Food.size = "large";
        obj2.price = 1200;
        Food obj3 = new Food();
        obj3.name = "hot dog";
        Food.size = "medium";
        obj3.price = 700;
        Food.size = "small";
        Food.show(obj1);
        Food.show(obj2);
        Food.show(obj3);
    }
}
