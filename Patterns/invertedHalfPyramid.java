public class invertedHalfPyramid {
    public static void inverted_HalfPyramid(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_HalfPyramid(5);
    }
}
