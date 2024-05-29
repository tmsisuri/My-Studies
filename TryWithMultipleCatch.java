public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = "Hello";

        try {
            j = 18/i;
            System.out.println(str.charAt(5));
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of range");
        }
        //parent class(Exception) should be at the bottom
        catch(Exception e) { 
            System.out.println("somethig went wrong. " + e);
        }

        System.out.println(j);

        System.out.println("bye");
    }
}