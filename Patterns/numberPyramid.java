public class numberPyramid {
    public static void number_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            //space
             for (int j = 1; j <(n - i)+ 1; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j =1; j<=i; j++){
                System.out.print(i + " ");
                
            }
           
            System.out.println();
        }
    }

    public static void main(String args[]) {
        number_pyramid(5);
    }
}
