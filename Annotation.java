class A {
    public void showTheDataWitchBelongsToThisClass() {
        System.out.println("In A show");
    }
}
class B extends A {
    @Override  // annotation 
    public void showTheDataWitchBelongsToThisClass() {
        System.out.println("In B show");
    }
}
public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWitchBelongsToThisClass();
    }
}