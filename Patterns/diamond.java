public class diamond {
    public static void diamond_pattern(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second
        for (int i = n; i >= 1; i--) {
            // inner Loop
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        diamond_pattern(5);
    }
}
