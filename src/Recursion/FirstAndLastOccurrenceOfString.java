package Recursion;

import java.util.Arrays;

public class FirstAndLastOccurrenceOfString {

    public static void main(String[] args) {

        String str = "abaacdaefaah";
        char ch = 'a';
        int index = 0;
        int[] res = findFirstAndLastOccurrence(str, index, ch);
        System.out.println(Arrays.toString(res));

    }

    private static int[] findFirstAndLastOccurrence(String str, int index, char ch) {
        int[] res = {-1, -1};
        if (index == str.length()) {
            return res;
        }
        char curChar = str.charAt(index);
        if (curChar == ch) {
            if (res[0] == -1) {
                res[0] = index;
            } else {
                res[1] = index;
            }

        }

        return findFirstAndLastOccurrence(str, index + 1, ch);
    }

}
