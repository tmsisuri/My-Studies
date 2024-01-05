class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in A show");
    }
}
class Object1 {
    public static void main(String arg[]){
        //referenced object
        A obj1 = new A(); // ( obj - 1 )
        obj1.show();
        
        //anonymous object
        new A(); // ( obj - 2 )
        new A().show(); // ( obj - 3 )
    }
}
