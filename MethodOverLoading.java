class Calculator{
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1 , int n2){
        return n1 + n2;
    }
}
class MethodOverLoading {
    public static void main(String arg[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(3,5);
        System.out.println(r1);
        int r2 = obj.add(7,8,2);
        System.out.println(r2);
        double r3 = obj.add(2.34,4);
        System.out.println(r3);
    }   
}
