class MyNewException extends Exception{
    public MyNewException(String string) {
        super(string);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0; 

        try {
            j = 18/i;
            if(j==0) {
                throw new MyNewException("I don't want to print zero");
            }
        }
        catch(MyNewException e) {
            j = 18/1;
            System.out.println(j + " is the default output " + e);
        }
        catch(Exception e) { 
            System.out.println("somethig went wrong. " + e);
        }

        System.out.println(j);

        System.out.println("bye");
    }
}
