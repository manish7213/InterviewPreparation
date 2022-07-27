package BinarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted array and two numbers x and k, find  k closest values to x.
 * int[] arr = {1, 2, 3, 4, 5};
 * int x = 3;
 * int k = 4;
 * <p>
 * Expected output : {1,2,3,4} are the 4(k) numbers which are closest to 3(x);
 */
public class KClosestNumberSortedArray_PENDING {
    private static List<Integer> kClosest(int[] arr, int x, int k) {
        List<Integer> result = new ArrayList<>();

        return result;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int k = 4;
//        int[] arr = {5, 6, 7, 8};
//        int x = 7;
//        int k = 3;
        List<Integer> res = kClosest(arr, x, k);
        System.out.println(res);
    }


}
