package Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInStream {

    private final Queue<Integer> queue;
    private final int k;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();

        for (int x : nums) {
            queue.add(x);
        }
        while (queue.size() > k) {
            queue.remove();
        }
    }

    public int add(int val) {
        queue.add(val);

        if (queue.size() > k) {
            queue.remove();
        }
        return queue.peek();
    }

}
