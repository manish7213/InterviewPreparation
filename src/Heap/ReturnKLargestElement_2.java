package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ReturnKLargestElement_2 {

    private static List<Integer> getListOfKLargestElement(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : arr) {
            minHeap.add(n);

            if (minHeap.size() > k) {
                minHeap.poll();
            }

        }

        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll());
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 8, 2, 9, 6, 12, 1};
        int k = 3;
        List<Integer> list = getListOfKLargestElement(arr, k);
        System.out.println(list);
    }

}
