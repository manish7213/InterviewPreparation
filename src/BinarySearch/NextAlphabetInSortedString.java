package BinarySearch;

public class NextAlphabetInSortedString {

    private static int findNextAlphabet(char[] chars, char target, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (chars[mid] == target) {
                start = mid + 1;
            } else if (chars[mid] > target) {
                res = mid;
                end = mid - 1;
            } else if (chars[mid] < target) {
                start = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'c', 'f', 'g'};
        char target = 'c';
        int res = findNextAlphabet(chars, target, 0, chars.length - 1);
        if (res == -1) {
            System.out.println("Not found");
        } else {

            System.out.println(chars[res]);
        }
    }
}
