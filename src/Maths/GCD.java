package Maths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(15, 27));
        System.out.println(gcd(24, 60));
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else {
            return gcd(b, a % b);
        }
    }
}
