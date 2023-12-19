class JavaString {
    public static void main(String arg[]){
        String newname = new String("Hello");
        System.out.println(newname.charAt(4));
        System.out.println(newname.concat(" Sara Have A Good Day"));

        String name = " Sara ";
        System.out.println("Hello" + name);
        String n1 = "isuri";
        String n2 = "isuri";
        System.out.println(n1 == n2);
        //immutable String = data that can't chang
        //mutable String = data that can chang
        //String is immutable 
    }
}
