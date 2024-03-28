public class IntToByteTypeCasting {
    public static void main(String[] args) {
        //int to byte

        //When int is assigned to the value between -128 to 127 inclusive, the conversion to the byte of that number will remain the same.
        int x = 115;
        byte b = (byte) x;
        System.out.println(b);

        //If int is less than -128, we just add than number with 256 to convert into byte.
        int x1 = -185;
        byte b1 = (byte) x1;
        System.out.println(b1); //(256 + (-185) = 71)

        //If int ranges between 128 to 256 inclusive, that number will be deducted with 256.
        int x2 = 187;
        byte b2 = (byte) x2;
        System.out.println(b2); //(187 - 256 = -69)

        //if the number is greater than 256, we will divide that number with 256 and tke the reminder


        int x3 = 3627;
        byte b3 = (byte) x3;
        System.out.println(b3); //(3627 % 256 = 43)

        int x4 = 6578;
        byte b4 = (byte) x4;
        System.out.println(b4); //(6578 % 256 = 178 ) and next (178 - 256 = -78)
    }
}
