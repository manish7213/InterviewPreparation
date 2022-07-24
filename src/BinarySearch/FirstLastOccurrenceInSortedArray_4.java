package BinarySearch;

import java.util.Arrays;

public class FirstLastOccurrenceInSortedArray_4 {

    public int[] searchRange(int[] nums, int target) {

        return findRange(nums, target);
    }


    private int[] findRange(int[] nums, int target) {
        int[] res = new int[2];
        int firstIndex = firstOccurrenceBinarySearch(nums, target, 0, nums.length - 1);
        int lastIndex = lastOccurrenceBinarySearch(nums, target, 0, nums.length - 1);

        res[0] = firstIndex;
        res[1] = lastIndex;

        return res;

    }

    private int lastOccurrenceBinarySearch(int[] numbs, int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == numbs[mid]) {
                res = mid;
                start = mid + 1;
            } else if (target < numbs[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Last Index is : {} " + res);
        return res;
    }

    private int firstOccurrenceBinarySearch(int[] numbs, int target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == numbs[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target < numbs[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("First Index is : {} " + res);
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 2};
//        int target = 2;

        int[] nums = {5, 7, 8, 8, 8, 10};
        int target = 8;

        FirstLastOccurrenceInSortedArray_4 ob = new FirstLastOccurrenceInSortedArray_4();
        int[] res = ob.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }

}