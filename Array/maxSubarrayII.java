public class maxSubarrayII {
    public static void max_SubArraysKadane(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
          maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max sum of subArrays is : " + maxSum);

    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3  };
        max_SubArraysKadane(numbers);
    }
}
