import pets.Dog;
import pets.Cat;
public class Animal {
    public static void main(String arg[]){
        Dog obj = new Dog();
        Cat obj1 = new Cat();
        obj.run();
        obj1.age(5);
        obj1.meals(3);
        obj1.colour = "black";
        System.out.println(obj1.colour);
    }    
}
