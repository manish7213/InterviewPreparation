package Misc;

import java.util.Arrays;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class BuySellStocks {

    public static void main(String[] args) {
        int[] numbers = {7,1,5,3,6,4};
//        int numbers[] = {3, 1, 4, 8, 7, 2, 5};
//        int numbers[] = {7,6,4,3,1};
//        int maxProfit = findMaxProfitBruteForce(numbers);    // Time - O(N^2)
//        int maxProfit = findMaxProfitExtraSpace(numbers);    // Time - O(N) , space - O(N)
        int maxProfit = findMaxProfitOptimal(numbers);    // Time - O(N) --Best Solution
        System.out.println(maxProfit);
    }

    private static int findMaxProfitOptimal(int[] nums) {
        int minSoFar = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minSoFar) {
                minSoFar = nums[i];
            }

            if (nums[i] - minSoFar > max) {
                max = nums[i] - minSoFar;
            }


        }
        return max;
    }

    private static int findMaxProfitExtraSpace(int[] nums) {
        int[] aux = new int[nums.length];
        int maxSoFar = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxSoFar) {
                maxSoFar = nums[i];
            }
            aux[i] = maxSoFar;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (aux[i] - nums[i] > max) {
                max = aux[i] - nums[i];
            }
        }

        System.out.println(Arrays.toString(aux));
        return max;
    }

    private static int findMaxProfitBruteForce(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] > max) {
                    max = nums[j] - nums[i];
                }
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;
    }
}
