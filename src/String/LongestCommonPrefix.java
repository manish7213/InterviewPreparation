package String;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String res = findLongestCommonPrefix(input);
        System.out.println(res);
    }

    private static String findLongestCommonPrefix(String[] input) {
        if (input.length == 0) {
            return "";
        }

        String prefix = input[0];

        for (int i = 1; i < input.length; i++) {
            while (input[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
