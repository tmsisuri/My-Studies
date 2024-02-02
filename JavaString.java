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
        sbr.deleteCharAt(18);
        System.out.println(sbr);
        sbr.delete(19, 21);
        System.out.println(sbr);
        sbr.insert(18,"!");
        System.out.println(sbr);
        //upper case and lower case in string
        String sr = "Hello This Is My First Java Project";
        //length of the String variable
        int x = sr.length();
        System.out.println(x);
        //turn every letter to upper case
        String i = sr.toUpperCase();
        System.out.println(i);
        //turn every letter to lower case
        String s = sr.toLowerCase();
        System.out.println(s);
    }
}
