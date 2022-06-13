package Heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int resultant = 0;

        if (stones.length == 1) {
            return stones[0];
        }
        for (int n : stones) {
            pq.add(n);
        }
        while (pq.size() > 1) {
            int s1 = pq.poll();
            int s2 = pq.poll();
            resultant = Math.abs(s2 - s1);
            pq.add(resultant);

        }

        return resultant;

    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int[] stones = {9, 3, 2, 10};
        int leftStone = lastStoneWeight.lastStoneWeight(stones);
        System.out.println(leftStone);

    }
}
