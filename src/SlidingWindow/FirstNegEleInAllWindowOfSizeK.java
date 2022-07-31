package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegEleInAllWindowOfSizeK {

    public static void main(String[] args) {
//        int[] arr = {5, -2, 3, 4, -5}; // -2, -2, 0, -5
//        int k = 2;
        int[] arr = {10, -1, -5, 7, -15, 20, 18, 24};
        int k = 3;

        List<Integer> negList = findFirstNegBruteForce(arr, k);
        System.out.println("Brute Force : " + negList);

        List<Integer> negList2 = findFirstNegSlidingWindow(arr, k);
        System.out.println("First Negative Sliding window : " + negList2);
//        {5, -2, 3, 4, -5}
    }

    private static List<Integer> findFirstNegSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                queue.add(arr[j]);
            }

            if (j - i + 1 == k) {
                if (queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.peek());
                    if (queue.peek() == arr[i]) {
                        queue.poll();
                    }
                }

                i++;
            }
        }
        return result;
    }

    private static List<Integer> findFirstNegBruteForce(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            boolean flag = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    flag = true;
                    res.add(arr[j]);
                    break;
                }


            }

            if (!flag) {
                res.add(0);
            }

        }
        return res;
    }

}
