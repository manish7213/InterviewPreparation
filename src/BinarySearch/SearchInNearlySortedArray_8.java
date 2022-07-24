package BinarySearch;

public class SearchInNearlySortedArray_8 {

    // Nearly Sorted Array means, an element can be found on i-1th or ith or i+1th index in sorted Arrays.
    // Example : {5,10,30,20,40} , here we have to search for 20 which on i+1th index.

    private static int findInNearlySortedArray(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if ((end >= mid + 1) && nums[mid + 1] == target) {
                return mid + 1;
            } else if ((start >= mid - 1) && nums[mid - 1] == target) {
                return mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 2;
            } else if (target < nums[mid]) {
                end = mid - 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10,30, 20, 40}; // expected answer is : 2
        int target = 30;
        int res = findInNearlySortedArray(nums, target, 0, nums.length - 1);

        System.out.println(res);
    }
}
