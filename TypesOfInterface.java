public class TypesOfInterface {
    //Normal Interfaces
    //Normal interfaces are the standard form of interfaces in Java, containing more than one abstract methods
    //These interfaces define methods that a class must implement if it chooses to implement the interface

    interface A {
        void show();
        void run();
    }

    //Functional Interfaces
    //Functional interfaces are interfaces that contain exactly one abstract method
    //They can be used as the assignment target for lambda expressions or method references
    //They are also known as Single Abstract Method (SAM) interfaces
    //The @FunctionalInterface annotation can be used to mark an interface as a functional interface

    @FunctionalInterface
    interface B {
        void config();
    }

    //Marker Interfaces
    //Marker interfaces are empty interfaces, used to mark a class with a special meaning or to indicate that the class belongs to a particular category
    //They do not contain any methods

    interface C {
        
    }
}
