class solidRhombus {

    public static void solid_rhombus(int n) {

        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.print();
    }

    public static void main(String args[]) {
        solid_rhombus(5);
    }
}