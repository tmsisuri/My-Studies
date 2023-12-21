class JavaString {
    public static void main(String arg[]){
        //immutable String = data that can't chang
        //mutable String = data that can chang
        //String is immutable 
        String newname = new String("Hello");
        System.out.println(newname.charAt(3));
        System.out.println(newname.concat(" Sara Have A Good Day"));

        String name = " Sara ";
        System.out.println("Hello" + name);
        String n1 = "isuri";
        String n2 = "isuri";
        System.out.println(n1 == n2);

        //StringBuffer and StringBuilder
        //difference between StringBuffer and StringBuilder
        //StringBuffer is thread safe and StringBuilder is not
        StringBuffer sb = new StringBuffer("JAVA");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Studies");
        System.out.println(sb);
        sb.deleteCharAt(9);
        System.out.println(sb);
        sb.insert(0,"My ");
        System.out.println(sb);
        sb.setLength(20);
        sb.ensureCapacity(100);
        //StringBuffer to String
        String str = sb.toString();
        System.out.println(str);
        //StringBuilder
        StringBuilder sbr = new StringBuilder("Hello");
        System.out.println(sbr);
        System.out.println(sbr.capacity());
        System.out.println(sbr.length());
        sbr.append(" Good Morning!!!!");
        System.out.println(sbr);
    }
}
