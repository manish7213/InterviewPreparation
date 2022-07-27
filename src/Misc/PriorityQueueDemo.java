package Misc;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        minHeapImpl();
        maxHeapImpl();
    }

    private static void maxHeapImpl() {
        System.out.println("********** MAX HEAP IMPL STARTS ***************");
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(1);
        maxHeap.add(30);
        maxHeap.add(8);

        System.out.println(maxHeap.peek());
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
        System.out.println("After polling the top element : {} " + maxHeap);
        System.out.println("***************** MAX HEAP IMPL ENDS *****************");
    }

    private static void minHeapImpl() {
        System.out.println("MIN HEAP IMPL STARTS");
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(4);
        minHeap.add(30);
        minHeap.add(8);

        System.out.println(minHeap.peek());
        System.out.println(minHeap.poll());
        System.out.println("After polling the top element : {} " + minHeap);
        System.out.println("MIN HEAP IMPL ENDS");
    }
}
