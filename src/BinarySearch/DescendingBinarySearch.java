package BinarySearch;

public class DescendingBinarySearch {

    private static int descendingBinarySearch(int[] numbs, int target, int start, int end) {

        int mid = start + (end - start) / 2;
        if (start <= end) {
            if (numbs[mid] == target) {
                return mid;
            } else if (target > numbs[mid]) {
                return descendingBinarySearch(numbs, target, start, mid - 1);
            } else {
                return descendingBinarySearch(numbs, target, mid + 1, end);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {12, 11, 10, 8, 8, 7, 2};
        int target = 12;

        int i = descendingBinarySearch(nums, target, 0, nums.length - 1);
        System.out.println(i);
    }
}
