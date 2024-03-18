class palindromePattern{
    public static void palindrom_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            //space
             for (int j = 1; j <(n - i)+ 1; j++) {
                System.out.print(" ");
            }
            //number
            for (int j = i; j > 1; j--) {
                    System.out.print(j);
                }
            // stars
            for(int j =1; j<=i; j++){
                System.out.print(j);
                
            }
           
            System.out.println();
        }
    }

    public static void main(String args[]) {
        palindrom_pyramid(5);
    } 
}