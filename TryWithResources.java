import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;

        //resources will be closed automatically
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
