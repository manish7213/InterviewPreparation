package Heap;

import java.util.*;

public class FrequencySort {
    private static int[] frequencySort(int[] arr, int k) {
        Map<Integer, Integer> freqMap = findFrequency(arr);
        int[] res = new int[arr.length];
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.freq == o2.freq) {
                    return o2.value - o1.value;
                } else {
                    return o2.freq - o1.freq;
                }
            }
        });
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            minHeap.add(pair);
        }

        int j = 0;
        while (!minHeap.isEmpty()) {
            Pair pair = minHeap.poll();
            int number = pair.value;
            int freq = pair.freq;
            for (int i = 0; i < freq; i++) {
                res[j++] = number;
            }
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
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7};
        int k = 3;
//        Map<Integer, Integer> frequency = findFrequency(arr);
//        System.out.println(frequency);

        int[] res = frequencySort(arr, k);
        System.out.println(Arrays.toString(res));

    }

    private static class Pair {
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
