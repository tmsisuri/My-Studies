import java.util.Scanner;

public class ReverseString {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input word : ");
        String word = sc.nextLine();
        //type the word
        for(int x=0 ; x<word.length() ; x++){
            System.out.print(word.charAt(x) + " ");
        }
        System.out.println();
        //reversed the word (type 1)
        for(int x=word.length()-1 ; x>-1 ; x--){
            System.out.print(word.charAt(x) + " ");
        }
        System.out.println();
        //reversed the word (type 2)
        for(int x=0 ; x<word.length() ; x++){
            int i = word.length()-x-1;
            System.out.print(word.charAt(i) + " ");
        }
        sc.close();
    }
}

