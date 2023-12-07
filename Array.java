class Array {
    public static void main(String arg[]){
        //creation of array
        //when know the values
        int num[] = {3,6,8,2};
        System.out.println(num[2]);
        //when don't know the values first
        int x[] = new int[4];
        x[0] = 2;
        x[1] = 5;
        x[2] = 7;
        x[3] = 4;
        System.out.println(x[2]);
        //print all values
        for(int i=0; i<4; i++){
            System.out.println(x[i]);
        }
    }
    
}
