package SlidingWindow;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 * <p>
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
public class MaximumAverageSubArray {

    public static double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double max = Long.MIN_VALUE;
        double avg = 1.0;
        while (j < nums.length) {
            sum = sum + nums[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                System.out.println("Sum of sliding windows : " + sum);
                avg = sum / k;
                System.out.println("Average of sliding windows : " + avg);
                if (avg > max) {
                    max = avg;
                }
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double maxAverage = findMaxAverage(nums, k);
        System.out.println(maxAverage);

    }
}
