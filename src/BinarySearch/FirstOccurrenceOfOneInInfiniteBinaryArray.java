package BinarySearch;

public class FirstOccurrenceOfOneInInfiniteBinaryArray {

    // This problem = Infinite Binary Search + First Occurrence In a Sorted Array

    private static int firstOccurrenceOfOneInInfiniteBinaryArray(int[] nums, int target, int start, int end) {
        while (target > nums[end]) {
            start = end;
            end = end * 2;
        }
        return firstOccurrence(nums, target, start, end);
    }

    private static int firstOccurrence(int[] nums, int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 1;
        int start = 0;
        int end = 1;
        int res = firstOccurrenceOfOneInInfiniteBinaryArray(nums, target, start, end);
        System.out.println(res);

    }
}
