package Recursion.basic;

public class ReverseString {


    private String reverseStr(int start, String str, int end) {
        if (start >= end) {
            return str;
        }
        str = swap(start, str, end);
        return reverseStr(start + 1, str, end - 1);
    }

    private String swap(int start, String str, int end) {
        char[] chars = str.toCharArray();
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        return new String(chars);
    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str = "Manish";
        String res = reverseString.reverseStr(0, str, 5);
        System.out.println(res);

    }
}
