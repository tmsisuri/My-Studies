abstract class Car{
    public abstract void drive();
    
    public abstract void park();

    public void playMusic(){
        System.out.println("play music...");
    }
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
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.park();
    }
}
