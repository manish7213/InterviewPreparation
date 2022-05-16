package Maths;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialRecursive(n));

        System.out.println(factorialIterative(n));
    }

    private static int factorialIterative(int n) {
        if (n <= 1 ) return 1;
        int res = 1;
        for(int i = n ; i >= 1 ; i--) {
            res = res * i;
        }

        return res;
    }

    private static int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return factorialRecursive(n - 1 ) * n;
    }
}
