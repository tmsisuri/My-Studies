class Calc{
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int sub(int n1 , int n2){
        return n1 - n2;
    }
}
class AdvCalc extends Calc{
    public int add(int n1 , int n2){
        return n1 + n2 + 4;
    }
}
class MethodOverRiding {
    public static void main(String arg[]){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5 , 6);
        int r2 = obj.sub(8 , 6);
        System.out.println(r1);
        System.out.println(r2);

    }
}
