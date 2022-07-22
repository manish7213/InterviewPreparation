package BinarySearch;

public class BinarySearch {

    private static int binarySearch(int[] nums, int target, int start, int end) {

        int mid = start + (end - start) / 2;

        if (start <= end && start <= nums.length - 1) {

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return binarySearch(nums, target, mid + 1, end);
            } else {
                return binarySearch(nums, target, start, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10,11,12};
        int target = 8;

//        int[] nums = {2,2};
//        int target = 2;

//        int[] nums = {2, 3, 3, 3};
//        int target = 2;

//        int[] nums = {5,7,7,8,8,10};
//        int target = 10;
        int i = binarySearch(nums, target, 0, nums.length - 1);
        System.out.println(i);
    }
}
