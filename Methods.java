class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost){
        if(cost >= 10)
        return "Pen";
        return "Nothing";
    }
}
class Methods {
    public static void main(String arg[]){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);

    }
    
}
