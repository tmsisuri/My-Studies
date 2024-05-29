public class TryCatch {
    public static void main(String[] args) {
        //try --> try to execute the statements if everything goes good and it will execute the remaining statements
        //catch --> if something went wrong if there's exception it will execute the catch block and remaining statements
        //the catch block will be executed only in case of exception otherwise it will be skipped
        int i = 0;
        int j = 0;
        try {
            j = 18/i;
        }catch(Exception e) {
            System.out.println("Something Went Wrong...");
        }

        System.out.println(j);

        System.out.println("bye");
    }
}
