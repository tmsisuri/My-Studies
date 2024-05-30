import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        BufferedReader bf = null;

        try {
            bf = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally {
            bf.close();
        }

    }
}
