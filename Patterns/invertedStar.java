public class invertedStar {

    public static void inverted_star(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // stars
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_star(5);
    }
}
