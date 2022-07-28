package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SumOfEleBetweenK1thSmallestAndK2thSmallest_7 {
    private static int findSumBetweenKthSmallest(int[] arr, int k1, int k2) {
        int n1 = findKthSmallestNumber(arr, k1);
        System.out.println(k1+"th smallest number is : " + n1);
        int n2 = findKthSmallestNumber(arr, k2);
        System.out.println(k2+"th smallest number is : " + n2);
        int sum = 0;
        for (int n : arr) {
            if (n > n1 && n <  n2) {
                sum += n;
            }
        }

        return sum;
    }

    private static int findKthSmallestNumber(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n : arr) {
            maxHeap.add(n);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return !maxHeap.isEmpty() ? maxHeap.peek() : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 12, 5, 15, 11};
        int k1 = 3;
        int k2 = 6;
        int sum = findSumBetweenKthSmallest(arr, k1, k2);
        System.out.println(sum);

    }
}
