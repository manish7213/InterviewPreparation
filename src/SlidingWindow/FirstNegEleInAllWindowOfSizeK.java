package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegEleInAllWindowOfSizeK {

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4, -5}; // -1,-1,-7,-15,-15
        int k = 2;

        List<Integer> negList = findFirstNegBruteForce(arr, k);
        System.out.println(negList);

        List<Integer> negList2 = findFirstNegSlidingWindow(arr, k);
        System.out.println(negList2);

    }

    private static List<Integer> findFirstNegSlidingWindow(int[] arr, int k) {
        int i = 0;
        int j = 0;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        while (j < arr.length) {
            //calculation
            if (arr[j] < 0) {
                temp.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // exclude first
                if (!temp.isEmpty()) {
                    res.add(temp);
                    temp.clear();
                }
                i++;
                j++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (List<Integer> list : res) {
            if (!list.isEmpty()) {
                Integer integer = list.get(0);
                result.add(integer);
            }
        }
        return result;
    }

    private static List<Integer> findFirstNegBruteForce(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    res.add(arr[j]);
                    break;
                }
            }
        }
        return res;
    }

}
