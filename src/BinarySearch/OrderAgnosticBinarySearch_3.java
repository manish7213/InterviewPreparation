package BinarySearch;

public class OrderAgnosticBinarySearch_3 {

    private static int search(int[] numbs, int target, int start, int end) {
        if (numbs.length == 1 && numbs[0] == target){
            return 0;
        }

        if (numbs[0] < numbs[numbs.length - 1]) {
            return ascendingBinarySearch(numbs, target, start, end);
        }
        else {
            return descendingBinarySearch(numbs, target, start, end);
        }
    }

    private static int descendingBinarySearch(int[] numbs, int target, int start, int end) {
       //using loop

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbs[mid] == target) {
                return mid;
            } else if (target > numbs[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }

        return -1;
    }

    private static int ascendingBinarySearch(int[] numbs, int target, int start, int end) {
        //using loop

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbs[mid] == target) {
                return mid;
            } else if (target > numbs[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

//        int[] nums = {5,7,7,8,8,10,11,12};
//        int target = 11;

        int[] nums = {12, 11, 10, 8, 8, 7, 2};
        int target = 7;

        int search = search(nums, target, 0, nums.length - 1);
        System.out.println(search);
    }
}
