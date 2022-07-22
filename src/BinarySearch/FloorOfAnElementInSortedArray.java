package BinarySearch;

public class FloorOfAnElementInSortedArray {
    // Floor of n means : Greatest element smaller than or Equal to n

    private static int findFloor(int[] nums, int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                res = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8, 10, 10, 12, 19};
        int target = 5;
        int res = findFloor(nums, target, 0, nums.length - 1);
        System.out.println(nums[res]);

    }
}
