public class triangle01 {
    public static void triangle_01(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <=i; j++) {
                 if((i+j) %2 == 0){
                System.out.print("1");
                 }else{
                    System.out.print("0");
                 }
                 
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        triangle_01(5);
    }  
}
