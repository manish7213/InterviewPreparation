package Recursion.basic;

public class Factorial {

    private int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return findFactorial(n - 1) * n;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        int res = factorial.findFactorial(4);
        System.out.println(res);
    }
}
