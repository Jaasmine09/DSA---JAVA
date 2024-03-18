class halfPyramid{

public static void half_pyramid(int n){
     //outer loop
     for(int i = 1; i<=n; i++){
        //inner loop
        for(int j=1; j<=i; j++){
            System.out.print(j + " ");
        }

        System.out.println();
     }
}

    public static void main(String args[]){
       half_pyramid(5);
    }
}