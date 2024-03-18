public class star {

public static void star(int n){
   //outer Loop
   for(int i = 1; i<=n; i++){
    //inner loop
    for(int j = 1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
   }
}

    public static void main(String args[]){
       star(9);
    }
}
