package Misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};
//        int res = new LongestConsecutiveSequence().longestConsecutive(numbers);
        int res = new LongestConsecutiveSequence().longestConsecutive_Optimal(numbers);
        System.out.println(res);

    }

    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int res = 0;
        for (int a : nums) {
            map.put(a, true);
        }

        for (int a : nums) {
            if (map.containsKey(a - 1)) {
                map.put(a, false);
            }
        }
        int maxStartPoint = 0;
        int maxLength = 0;
        for (int n : nums) {
            if (map.get(n) == true) {
                int tempLength = 1;
                int tempStartPoint = n;
                while (map.containsKey(tempStartPoint + tempLength)) {
                    tempLength++;
                }

                if (tempLength > maxLength) {
                    maxStartPoint = tempStartPoint;
                    maxLength = tempLength;
                }
            }
        }

//        for (int i = 0; i < maxLength; i++) {
//            res += maxStartPoint + i;
//        }

        return maxLength;
    }

    public int longestConsecutive_Optimal(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
