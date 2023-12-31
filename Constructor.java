class Drinks{
    private String name;
    private int price;
    public Drinks(){
        name = "drinks";
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
    }
}
