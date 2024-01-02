class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        this();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super(4);
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B int");
    }
}
class C{
    public C(){
        super();
        System.out.println("in C");
    }
}
class ThisAndSuperMethod {
    public static void main(String arg[]){
        //this method execute the constructor of the same class
        //super method execute the constructor of the super class
        A obj1 = new A();
        System.out.println(obj1);
        A obj2 = new A(7);
        System.out.println(obj2);
        B obj3 = new B();
        System.out.println(obj3);
        B obj4 = new B(4);
        System.out.println(obj4);
        C obj5 = new C();
        System.out.println(obj5);
    }
}
