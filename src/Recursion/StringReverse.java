package Recursion;

public class StringReverse {
    private String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        String str = "Manish Kumar";
        StringReverse obj = new StringReverse();
        String s = obj.reverseString(str);
        System.out.println(s);
    }
}
