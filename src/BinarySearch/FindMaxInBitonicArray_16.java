package BinarySearch;

/**
 * Bitonic Array : It is an array which will be monotonically increase and then monotonically decrease.
 * Number usually will not be repeated.
 *
 * hence, in any bitonic array there will only be single peak element and that will be the maximum of all.
 *
 * Peak element : It is an element in an array which is greater than it's both of immediate neighbours.
 */
public class FindMaxInBitonicArray_16 {

    private static int findMaxInBitonic(int[] nums) {
        return findPeak(nums, 0, nums.length - 1);
    }

    private static int findPeak(int[] nums, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && mid < nums.length - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (mid == 0) {
                if (nums[0] > nums[1]) {
                    return 0;
                } else return 1;
            } else if (mid == nums.length - 1) {
                if (nums[nums.length - 1] > nums[nums.length - 2]) {
                    return nums.length - 1;
                } else return nums.length - 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 12, 16, 13, 2};
        int res = findMaxInBitonic(nums); // returns index
        if (res >= 0) {
            System.out.println(nums[res]);
        }
    }
}
