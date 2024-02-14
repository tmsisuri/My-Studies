class Drinks{
    private String name;
    private int price;
    private String size;

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
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    //default constructor
    public Drinks(){
        name = "drinks";
        price = 100;
        System.out.println("object is created in default constructor");
    }

    //parameterized constructor
    public Drinks(String name , int price){
        this.name = name;
        this.price = price;
        System.out.println("object is created in parameterized constructor");
    }
    public Drinks(String name) {
        this.name = name;
        price = 100;
        System.out.println("object is created in parameterized constructor");
    }

    //copy constructor
    //copy constructor is a constructor that creates an object using another object of the same Java class
    public Drinks(Drinks drinks , String size){
        this.name = drinks.name;
        this.price = drinks.price;
        this.size = size;
        System.out.println("object is created in copy constructor");
    }
    //chained constructor
    //chained constructor is used to call another constructor within the same class
    public Drinks(String name , int price , String size){
        this(name , price);
        this.size = size;
        System.out.println("object created in chained constructor");
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
        
        Drinks obj5 = new Drinks(obj2 , "small");
        System.out.println(obj5.getName() + " : " + obj5.getPrice() + " : " + obj5.getSize());

        Drinks obj6 = new Drinks("Tea" , 150 , "large");
        System.out.println(obj6.getName() + " : " + obj6.getPrice() + " : " + obj6.getSize());
        
        //every time when the object creat it will call the constructor
    }
}
