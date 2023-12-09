class EnhancedForLoop {
    public static void main(String arg[]){
        int num[] = new int[4];
       num[0] = 4;
       num[1] = 6;
       num[2] = 2;
       num[3] = 8;
       for(int n : num){
         System.out.println(n);
       }
        int c[][][] = new int[3][2][4];
         for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                for(int k=0; k<c[i][j].length; k++){
                    c[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        for(int a[][] : c){
            for(int b[] : a){
                for(int n : b){
                    System.out.print(n + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
