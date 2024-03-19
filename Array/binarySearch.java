public class binarySearch {
    public static int binary_Search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {

            int mid = (start + end) / 2;
            // comaprisions
            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] > key) {
                end = mid - 1; // left
            } else {
             start = mid + 1; // right
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 2;
       System.out.println("Index for key is:" + binary_Search(numbers, key));
    }
}
