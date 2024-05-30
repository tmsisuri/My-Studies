import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBufferedReader {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        

        int num = 0;

        try {
            num = Integer.parseInt(bf.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(num);
        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
