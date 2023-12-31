class Drinks{
    private String name;
    private int price;
    //default constructor
    public Drinks(){
        name = "drinks";
        price = 100;
    }
    //parameterized constructor
    public Drinks(String name , int price){
        this.name = name;
        this.price = price;
    }
    public Drinks(String name) {
        this.name = name;
        price = 100;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
class Constructor {
    public static void main(String arg[]){
        Drinks obj1 = new Drinks();
        System.out.println(obj1.getName() + " : " + obj1.getPrice());
        Drinks obj2 = new Drinks();
        obj2.setName("Coffee");
        obj2.setPrice(150);
        System.out.println(obj2.getName() + " : " + obj2.getPrice());
        Drinks obj3 = new Drinks("Hot chocolate" , 200 );
        System.out.println(obj3.getName() + " : " + obj3.getPrice());
        Drinks obj4 = new Drinks("Ice Coffee");
        System.out.println(obj4.getName() + " : " + obj4.getPrice());
    }
}
