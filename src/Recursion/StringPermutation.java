package Recursion;
// O(n * n!)
public class StringPermutation {
    private static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }

        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            permute(s, l + 1, r);
            s = swap(s, l, i);
        }
    }

    private static String swap(String s, int l, int r) {
        StringBuilder sb = new StringBuilder(s);
        char left = sb.charAt(l);
        char right = sb.charAt(r);
        sb.setCharAt(r, left);
        sb.setCharAt(l, right);
        return sb.toString();
    }

    public static void main(String[] args) {
        permute("abc", 0, 2);
    }
}
