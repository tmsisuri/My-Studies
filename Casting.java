class Casting{
    public static void main(String arg[]){
        // conversion
        byte a = 42;
        int x = a;
        System.out.println(x);
        // casting
        int y = 32;
        byte b = (byte)y;
        System.out.println(b);
        double c = 8.943;
        float f = (float)c;
        System.out.println(f);
        //type promotion
        byte e = 23;
        byte g = 45;
        int result = e * g;
        System.out.println(result);
    }
}