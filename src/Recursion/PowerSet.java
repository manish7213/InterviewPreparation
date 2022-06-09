package Recursion;
// O(2^n)
public class PowerSet {

    private static void printPowerSet(String s, int index, String cur) {
        if (index == s.length()) {
            System.out.println(cur);
            return;
        }

        printPowerSet(s, index + 1, cur + s.charAt(index));
        printPowerSet(s, index + 1, cur);

    }

    public static void main(String[] args) {
        printPowerSet("abc", 0, "");
    }

}
