class Calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}
class Object {
    public static void main(String arg[]){
        //Object Oriented Programming
        //Object - properties and behaviours(methods) 
        //class - template of public properties and public behaviours in objacts
        int num1 = 4;
        int num2 = 3;
        Calculator calc =new Calculator();
        int result = calc.add(num1 , num2);
        System.out.println(result);
    }
    
}
