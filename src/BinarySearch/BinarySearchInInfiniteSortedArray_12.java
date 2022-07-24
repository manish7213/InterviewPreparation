package BinarySearch;

public class BinarySearchInInfiniteSortedArray_12 {

    private static int searchInInfiniteSortedArray(int[] nums, int target, int start, int end) {

        while (target > nums[end]) {
            start = end;
            end = end * 2;
        }

        return binarySearch(nums, target, start, end);

    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 8, 11, 19, 28, 32, 65, 100};
        int target = 32;
        int start = 0;
        // TODO: 22-07-2022 IMPORTANT !! 
        int end = 1; // We don't know the end because it is infinite, hence consider it as first index.
        int res = searchInInfiniteSortedArray(nums, target, start, end);
        System.out.println(res);
    }
}
