class Types{
    //no return and no accept
    public void method1(){
        System.out.println("Type one");
    }
    //no return and accept value
    public void method2(String a, int b){
        System.out.println("Type two");
    }
    //return value and no accept
    public int method3(){
        System.out.println("Type three");
        return 7;
    }
    //return value and accept value
    public String method4(int index, String name){
        System.out.println("Type four");
        return "Welcome";
    }
}
class MethodTypes {
    public static void main(String arg[]){
        Types tp = new Types();
        tp.method1();
        tp.method2("Hello", 7);
        int x = tp.method3();
        System.out.println(x);
        String str = tp.method4(2, "Jhon");
        System.out.println(str);
    }
}
