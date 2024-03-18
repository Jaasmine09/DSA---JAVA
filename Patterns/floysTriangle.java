public class floysTriangle {
    public static void floys_triangle(int n) {
        int number = 1;
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floys_triangle(5);
    } 
}
