abstract class Car{
    //Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
    //abstract methods can only be used in an abstract class, and it does not have a body. The body is provided by the subclass

    public abstract void drive();  //declaring a method
    public abstract void park();

    public void playMusic(){  //defining a method
        System.out.println("play music...");
    }
    //abstract class can't have constructors
    //asbtract class can have asbtract methods and non-abstract methods
    //also we can make abstract class without abstract methods(which has only non-abstract methods)
}
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("driving...");
    }
}
class UpdatedWagonR extends WagonR{ //concrete class
    public void park() {
       System.out.println("park...");
    }
}
public class Abstract {
    public static void main(String arg[]){
        //we can't create object of abstract class
        //we can create abstract class reference with concrete(non-abstract) class object
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.park();
    }
}
