package BinarySearch;

/**
 * Problem: To find the minimum difference of a target and number given in sorted Array.
 * Intuition: To find that we need to reach out to two numbers which in left and right of the given target.
 * Then only difference of one of the number will become answer.
 * In Binary Search: If number is not found , start and end points to those two locations if number is not found.
 */

public class MinDiffInSortedArray_14 {

    private static int minAbsDiff(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }

        if (Math.abs(nums[start] - target) < Math.abs(nums[end] - target)) {
            return start;
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 10, 12, 15};
        int target = 6;
        int res = minAbsDiff(nums, target, 0, nums.length - 1); // returns index
        if (res >= 0) {
            System.out.println(nums[res]);
        }

    }
}
