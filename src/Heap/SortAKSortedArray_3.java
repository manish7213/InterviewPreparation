package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Given an array of n elements, where each element is at most k away from its
 * target position, devise an algorithm that sorts in O(n log k) time.
 * For example, let us consider k is 2, an element at index 7 in the sorted array,
 * can be at indexes 5, 6, 7, 8, 9 in the given array.
 * <p>
 * Example:
 * Input : arr[] = {6, 5, 3, 2, 8, 10, 9}
 * k = 3
 * Output : arr[] = {2, 3, 5, 6, 8, 9, 10} .
 */

public class SortAKSortedArray_3 {

    private static List<Integer> sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);

            if (minHeap.size() > k) {
                res.add(minHeap.poll());
            }
        }

        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll());
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        List<Integer> res = sortKSortedArray(arr, k);
        System.out.println(res);

    }

}
