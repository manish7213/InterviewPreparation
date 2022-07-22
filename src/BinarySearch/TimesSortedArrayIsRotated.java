package BinarySearch;

public class TimesSortedArrayIsRotated {

    // Intuition : If Array is sorted , then index of the smallest element will be the number of times that sorted Array is rotated.
    // find the index if smallest element using Binary Search.

    private static int findNumberOfTimesArrayIsRotated(int[] nums, int start, int end) {
        int n = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return mid;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else if (nums[mid] >= nums[start]) {
                start = mid + 1;
            }

        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {15, 18, 2, 3, 6, 12}; // expected answer is : 2
        int n = findNumberOfTimesArrayIsRotated(nums, 0, nums.length - 1);
        System.out.println(n);
    }
}
