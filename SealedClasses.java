sealed class A extends Thread implements Cloneable permits B , C {
    //permits should be the last thing after extends and implements
}
final class B extends A{

}
final class C extends A{

}
class D {

}
sealed interface X permits Y{
    //intercafe can never be final
    //Permitted subinterfaces of a sealed interface must use one of the following modifiers
    //sealed      :  The subinterfaces can only be extended by specified interfaces
    //non-sealed  :  The subinterfaces can be extended by any interface
} 
non-sealed interface Y extends X {
    
}
public class SealedClasses {
    public static void main(String[] args) {
        //A sealed class is declared using the sealed modifier, followed by the permits keyword to specify the classes that are allowed to extend it
        //Only the classes listed in the permits clause can extend the sealed class
        //These subclasses must be in the same module or package as the sealed class

        //Permitted subclasses of a sealed class must use one of the following modifiers
        //final       :  The subclass cannot be extended further
        //sealed      :  The subclass can only be extended by specified classes
        //non-sealed  :  The subclass can be extended by any class
    }
}
