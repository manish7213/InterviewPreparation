package Heap;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Here we see that we need to find the median at any time and we know that finding median in an array become so easy if the array is sorted i.e, O(1).
 * So if we think about a way to get the array sorted before going to find the median of the array then this problem becomes easy and PriorityQueue(Heap) is the one which help us to do that, thats why here i used heaps. As i said heaps like multiple heap i used.
 *
 * Here i used maxHeap+minHeap both, it can also be done using one Heap and one ArrayList, but in that case the time complexity becomes O(n2) which cause TLE as input range it from -10^5 to 10^5.
 * Now why i used 2 heaps, here i used 2 heaps 1 to store the elements lesser that the other one which is on the other side of median Partition. Here we are always maintaining the median partition by making both the heaps of almost same length so that when we need our median element we can easily get it from the peek() of leftHeap or from the peek() of right heap.
 *
 * Now how to know the array length is even or odd at any time? This can be calculated easily as we maintained the almost same length of heaps, if both having same length then the array is even and if one is just greater that other then the array is of odd length.
 *
 * And we know for even length we need to take values from both sides of median partition and for odd length we are going to take the peek() value of heap which containing one extra element.
 *
 * Now go through the code and use dry run technique for complete understanding.
 */

public class MedianFinder {
    PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>((a, b) -> b - a);

    PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        leftMaxHeap.add(num);

        if (!leftMaxHeap.isEmpty() && !rightMinHeap.isEmpty() && leftMaxHeap.peek() > rightMinHeap.peek()) {
            int data = leftMaxHeap.poll();
            rightMinHeap.add(data);
        }
        if (leftMaxHeap.size() > rightMinHeap.size() + 1) {
            int data = leftMaxHeap.poll();
            rightMinHeap.add(data);
        } else if (rightMinHeap.size() > leftMaxHeap.size() + 1) {
            int data = rightMinHeap.poll();
            leftMaxHeap.add(data);
        }
    }

    public double findMedian() {
        //System.out.println(leftMaxHeap+" "+rightMinHeap);
        if (leftMaxHeap.size() == rightMinHeap.size())   // even length
        {
            return (leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
        } else                                    // odd length
        {
            return leftMaxHeap.size() > rightMinHeap.size() ? leftMaxHeap.peek() : rightMinHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        for (int i = 0; i < 7; i++) {
            int generatedNumber = new Random().nextInt(9);
            System.out.println("Added number : " + generatedNumber);
            medianFinder.addNum(generatedNumber);
            double median = medianFinder.findMedian();
            System.out.println("Median is : " + median);
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */