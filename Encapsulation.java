class Students{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
}
class Encapsulation {
    public static void main(String arg[]){
        Students obj1 = new Students();
        obj1.setName("Kevin");
        obj1.setAge(15);
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        Students obj2 = new Students();
        obj2.setName("Jhone");
        obj2.setAge(17);
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
    
}
