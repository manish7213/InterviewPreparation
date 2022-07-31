package SlidingWindow;

public class MaximumSumOfSubArrayOfGivenSize {

    private static int findMaxSumSlidingWindow(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (sum > max) {
                    max = sum;
                }

                sum = sum - arr[i];
                i++;
                j++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 18, 4};
        int k = 3;
        int bruteForceMax = findMaxSumBruteForce(arr, k);
        int slidingWindowMax = findMaxSumSlidingWindow(arr, k);

        System.out.println(bruteForceMax);
        System.out.println(slidingWindowMax);

    }

    private static int findMaxSumBruteForce(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }


}
