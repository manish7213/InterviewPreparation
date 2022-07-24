package BinarySearch;

public class SearchInRotatedSortedArray_7 {

    private static int searchInRotatedArray(int[] nums, int target, int start, int end) {
        int smallestNumIndex = findSmallestNumberIndex(nums, start, end);
        int leftSearch = binarySearch(nums, target, 0, smallestNumIndex - 1);
        int rightSearch = binarySearch(nums, target, smallestNumIndex, end);

        if (leftSearch == -1 && rightSearch == -1) {
            return -1;
        }

        if (leftSearch != -1) {
            return leftSearch;
        } else return rightSearch;
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {

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

        return -1;
    }

    private static int findSmallestNumberIndex(int[] nums, int start, int end) {

        int n = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                end = mid - 1;
            } else if (nums[mid] <= nums[end]) {
                start = mid + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12}; // expected answer is : 4
        int target = 18;

        int index = searchInRotatedArray(nums, target, 0, nums.length - 1);
        System.out.println(index);

    }
}
