package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement_1 {
    private static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
//            If size exceeds the given size K, then we have to pop the element which will be max in nature and make the queue size equal to k.
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }
        return !maxHeap.isEmpty() ? maxHeap.peek() : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 9, 45, 12};
        int k = 6;
        int res = findKthSmallest(arr, k);
        System.out.println(res);
    }
}
