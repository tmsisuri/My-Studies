class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
class StaticVariables {
    public static void main(String arg[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 14500;
        Mobile.name = "phone";
        Mobile obj2 = new Mobile();
        obj2.brand = "sanmsung";
        obj2.price = 17500;
        Mobile.name = "phone";
        Mobile.name = "smart phone";
        obj1.show();
        obj2.show();
    }
}
