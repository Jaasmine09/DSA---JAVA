public class smallestArray {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
             for (int i = 0; i < numbers.length; i++) {
                 if (smallest > numbers[i]) {
                    smallest = numbers[i];
                 }
             }
             return smallest;
     
         }
     
         public static void main(String args[]) {
             int numbers[] = {1, 2, 4, 6, 8, 10, 12, 14 };
            System.out.println("Smallest number in an array is:" + getSmallest(numbers));
             
         }
}
