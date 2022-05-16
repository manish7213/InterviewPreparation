package Maths;

public class TrailingZeroFactorial {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(finTrailingZeroInFactorial(a));
    }

    private static int finTrailingZeroInFactorial(int a) {
        int res = 0;
        for (int i = 5; i <= a; i = i * 5) {
            res = res + (a / i);
        }

        return res;
    }
}
