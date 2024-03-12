abstract class A{

    public abstract void show();
    public abstract void config();

}
public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args){
        //this will create a object of anonymous inner class(not create a object of A class(becouse A is a abstract class))
       A obj = new A(){
        public void show(){
            System.out.println("in new show");
        }
        public void config(){
            System.out.println("in config");
        }
       };
       obj.show();
       obj.config();
    }
}
