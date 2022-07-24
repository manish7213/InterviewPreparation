package BinarySearch;

public class CountOfAnElementInSortedArray_5 {

    private static int firstOccBinarySearch(int[] nums, int target, int start, int end) {

        int res = -1;
        while (start <= end) {
            int mid = start + (end - start / 2);
            if (nums[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    private static int lastOccurrenceBinarySearch(int[] nums, int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {5, 8, 8, 8, 8, 10};
        int target = 10;

        int firstOccurrence = firstOccBinarySearch(nums, target, 0, nums.length - 1);
        int lastOccurrence = lastOccurrenceBinarySearch(nums, target, 0, nums.length - 1);

        int countOfAnElement = (lastOccurrence - firstOccurrence) + 1;

        System.out.println(countOfAnElement);
    }

}
