public class invertedHalfPyramidNumber {
    public static void inverted_HalfPyramidNumber(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_HalfPyramidNumber(5);
    }
}
