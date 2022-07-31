package SlidingWindow;

/**
 * The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
 * <p>
 * It has a length of k.
 * It is a divisor of num.
 * Given integers num and k, return the k-beauty of num.
 * <p>
 * Note:
 * <p>
 * Leading zeros are allowed.
 * 0 is not a divisor of any value.
 * A substring is a contiguous sequence of characters in a string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 240, k = 2
 * Output: 2
 * Explanation: The following are the substrings of num of length k:
 * - "24" from "240": 24 is a divisor of 240.
 * - "40" from "240": 40 is a divisor of 240.
 * Therefore, the k-beauty is 2.
 * Example 2:
 * <p>
 * Input: num = 430043, k = 2
 * Output: 2
 * Explanation: The following are the substrings of num of length k:
 * - "43" from "430043": 43 is a divisor of 430043.
 * - "30" from "430043": 30 is not a divisor of 430043.
 * - "00" from "430043": 0 is not a divisor of 430043.
 * - "04" from "430043": 4 is not a divisor of 430043.
 * - "43" from "430043": 43 is a divisor of 430043.
 * Therefore, the k-beauty is 2.
 */

public class FindKBeautyOfNumber {

    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        String str = Integer.toString(num);
        for (int i = 0; i <= str.length() - k; i++) {
            int temp = Integer.parseInt(str.substring(i, i + k));

            if (temp != 0 && num % temp == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        int num = 240;
//        int k = 2;

        int num = 430043;
        int k = 2;
        int res = divisorSubstrings(num, k);
        System.out.println(res);

    }

}
