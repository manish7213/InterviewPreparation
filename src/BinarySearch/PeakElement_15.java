package BinarySearch;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * Example 2:
 * <p>
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 */
public class PeakElement_15 {

    private static int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        return  findPeak(nums, 0, nums.length - 1);

    }


    private static int findPeak(int[] nums, int start, int end) {
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (mid > 0 && mid < nums.length - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid + 1] > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (mid == 0) {
                if(nums[0] > nums[1]) {
                    return 0;
                } else  {
                    return 1;
                }
            } else if (mid == nums.length - 1) {
                if(nums[nums.length - 1] > nums[nums.length - 2]) {
                    return nums.length - 1;
                } else {
                    return nums.length - 2;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int res = findPeakElement(nums); // returns index
        if (res >= 0) {
            System.out.println(nums[res]);
        }

    }
}
