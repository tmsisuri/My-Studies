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
        //multi dimensional array
        int a[][] = new int[3][4];
        for(int j=0; j<3; j++){
            for(int k=0; k<4; k++){
                a[j][k] = (int)(Math.random()*10);
                System.out.print(a[j][k] + " ");
            }
            System.out.println();
        }  
        // 2nd method  
        for(int n[] : a){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
