package BinarySearch;

public class CeilOfAnElementInSortedArray_10 {
    // Ceil of n means : Smallest element greater than or Equal to n

    private static int findCeil(int[] nums, int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                res = mid;
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8, 10, 10, 12, 19};
        int target = 17;
        int res = findCeil(nums, target, 0, nums.length - 1);
        if (res == -1) {
            System.out.println("Not Found");
        } else {

            System.out.println(nums[res]);
        }

    }
}
