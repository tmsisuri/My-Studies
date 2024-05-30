import java.io.IOException;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");

        //this will gives a ASCII value
        //it reads only  one character at a time //ex - 456 read as 4
        //to read multiple chatacters we have to use a loop
        int num = 0;
        try {
            num = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(num - 48);
    }
}
