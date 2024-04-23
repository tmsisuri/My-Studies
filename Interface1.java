interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run : Faster");
    }
}
class Developer{
    public void devApp(Computer com){
        com.code();
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer developer = new Developer();
        developer.devApp(desktop);
        developer.devApp(laptop);

    }
}
