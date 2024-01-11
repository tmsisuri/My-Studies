class Calc{
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int sub(int n1 , int n2){
        return n1 - n2;
    }
}
//Single level inheritance
class AdvCalc extends Calc{
    public int multi(int n1 , int n2){
        return n1 * n2;
    }
    public int div(int n1 , int n2){
        return n1 / n2;
    }
}
//Multi level inheritance
class VeryAdvCalc extends AdvCalc{
    public double power(int n1 , int n2){
        return Math.pow(n1, n2);
    }
    public int remainder(int n1 , int n2){
        return n1 % n2;
    }
}
class Inheritance {
    public static void main(String arg[]){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 8);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(5,8);
        int r4 = obj.div(15,3);
        double r5 = obj.power(6, 3);
        int r6 = obj.remainder(45, 7);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);
    }
}
