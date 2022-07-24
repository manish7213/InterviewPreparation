package BinarySearch;

public class SearchInBitonicArray_17 {

    //Problem : Search an element in Bitonic Array.
    //Approach: Find Peak element in the Bitonic array which will give maximum value in the array.
    // Now, We can divide into two arrays since we have the maximum element index, first half will be increasing sorted
    // Second half will be decreasing sorted, Now we can apply Binary Search on the both arrays.

    private static int searchInBitonic(int[] nums, int target) {
        int res = -1;
        int maxEleIndex = findMaxIndex(nums, target, 0, nums.length);
        int ascBsRes = ascBinarySearch(nums, target, 0, maxEleIndex - 1);
        int descBsRes = descBinarySearch(nums, target, maxEleIndex, nums.length - 1);

        if (ascBsRes != -1) {
            res = ascBsRes;
        }

        if (descBsRes != -1) {
            res = descBsRes;
        }

        return res;
    }

    private static int descBinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private static int ascBinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int findMaxIndex(int[] nums, int target, int start, int end) {
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
                } else {
                    return nums.length - 2;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 12, 16, 13, 2};
        int target = 12;
        int res = searchInBitonic(nums, target); // returns index
        System.out.println(res);
    }
}
