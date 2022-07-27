package Heap;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */

public class KFrequentElementInAnArray {

    private static int[] findKFrequentElements(int[] arr, int k) {
        Map<Integer, Integer> freqMap = findFrequency(arr);
        int[] res = new int[k];
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.freq == o2.freq) {
                    return o1.value - o2.value;
                } else {
                    return o1.freq - o2.freq;
                }
            }
        });

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            minHeap.add(pair);
            System.out.println("Added to the heap : {} " + pair);

            if (minHeap.size() > k) {
                Pair poll = minHeap.poll();
                System.out.println("Removed from heap when heap size exceeds k : {} " + poll);
            }
        }
        int i = 0;
        while (!minHeap.isEmpty()) {
            res[i++] = minHeap.poll().value;
        }
        return res;
    }

    private static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7};
        int k = 3;
        Map<Integer, Integer> frequency = findFrequency(arr);
        System.out.println(frequency);

        int[] res = findKFrequentElements(arr, k);
        System.out.println(Arrays.toString(res));

    }

    static class Pair {
        int value;
        int freq;

        public Pair(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "value=" + value +
                    ", freq=" + freq +
                    '}';
        }
    }


}
