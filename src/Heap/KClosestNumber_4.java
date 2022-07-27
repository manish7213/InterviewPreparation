package Heap;

import java.util.*;

/**
 * Given an unsorted array and two numbers x and k, find  k closest values to x.
 * Input : arr[] = {10, 2, 14, 4, 7, 6}, x = 5, k = 3 .
 * <p>
 * Expected output : {4,7,6} are the 3(k) numbers which are closest to 5(x);
 */
public class KClosestNumber_4 {

    private static List<Integer> kClosest(int[] arr, int x, int k) {
        List<Integer> res = new ArrayList<>();
        // TODO: 26-07-2022 VERY IMPORTANT!!!! Comparator Implementation 
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((o1, o2) -> {

            if (o1.lag == o2.lag) {
                return o2.value - o1.value;
            } else {
                return o2.lag - o1.lag;
            }
        });

        for (int n : arr) {
            maxHeap.add(new Pair(Math.abs(x - n), n));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        while (!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();
            System.out.println(pair);
            res.add(pair.value);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 14, 4, 7, 6};
        int x = 5;
        int k = 3;
//        int[] arr = {1, 2, 3, 4, 5};
//        int x = 3;
//        int k = 4;
//        int[] arr = {5, 6, 7, 8};
//        int x = 7;
//        int k = 3;
        List<Integer> res = kClosest(arr, x, k);
        res.sort(Comparator.naturalOrder());

        System.out.println(res);
    }

    static class Pair {
        public int value;
        public int lag;

        public Pair(int lag, int value) {
            this.value = value;
            this.lag = lag;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "num=" + value +
                    ", diff=" + lag +
                    '}';
        }

    }

}


