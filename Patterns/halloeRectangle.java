public class halloeRectangle {
    public static void hallow_rectangle(int totalRows, int totalCols) {

        // outer Loop
        for (int i = 1; i <= totalRows; i++) {
            // inner Loop
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hallow_rectangle(4, 5);
    } 
}
