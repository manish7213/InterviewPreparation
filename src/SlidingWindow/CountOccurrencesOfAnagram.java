package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a word and a text, return the count of the occurrences of anagrams of the word in the text(For eg: anagrams of word for are for, ofr, rof etc.))
 * <p>
 * Examples:
 * <p>
 * Input : forxxorfxdofr
 * for
 * Output : 3
 * Explanation : Anagrams of the word for - for, orf,
 * ofr appear in the text and hence the count is 3.
 * <p>
 * Input : aabaabaa
 * aaba
 * Output : 4
 * Explanation : Anagrams of the word aaba - aaba,
 * abaa each appear twice in the text and hence the
 * count is 4
 */
public class CountOccurrencesOfAnagram {

    private static int countOccurrencesOfAnagrams(String str, String pattern) {
        int res = 0;
        char[] chars = str.toCharArray();
        char[] pattersArray = pattern.toCharArray();
        Map<Character, Integer> countMap = getCountMapOfPattern(pattersArray);
        int count = countMap.size();
        int k = pattern.length();
        int i = 0;
        int j = 0;
        while (j < str.length()) {

            // Calculation
            if (countMap.containsKey(chars[j])) {
                countMap.put(chars[j], countMap.get(chars[j]) - 1);
                if (countMap.get(chars[j]) == 0) {
                    count--;
                }
            }
            // Traverse through the window
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // window hits
                if (count == 0) {
                    res++;
                }

                // Reverse the operation for the ith element
                if (countMap.containsKey(chars[i])) {
                    countMap.put(chars[i], countMap.get(chars[i]) + 1);
                    if (countMap.get(chars[i]) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return res;
    }

    private static Map<Character, Integer> getCountMapOfPattern(char[] pattern) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : pattern) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "forxxorfxdofr";
        String pattern = "for"; // expected answer is 3
        int count = countOccurrencesOfAnagrams(str, pattern);
        System.out.println(count);
    }
}
