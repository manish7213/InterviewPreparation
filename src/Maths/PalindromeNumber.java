package Maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 404;
        int b = 456;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }

    private static boolean isPalindrome(int a) {
        int b = reverseNumber(a);
        return a == b;
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("Reversed number is : {} " + reverse);

        return reverse;
    }
}
