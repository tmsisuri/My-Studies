enum Status {
    Running, Failed, Pending, Success; //objects
}
public class Enum {
    public static void main(String[] args) {
        Status s1 = Status.Pending;
        System.out.println(s1);
        //ordinal() method is use for get the order number
        System.out.println(s1.ordinal());

        //get all values
        Status[] ss = Status.values();
        //print all values
        for (Status s : ss) {
            System.out.println(s.ordinal() + " : " + s);
        }
    }
}
