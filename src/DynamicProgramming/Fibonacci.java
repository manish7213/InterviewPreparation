package DynamicProgramming;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 9;
        int res = findNthFibonacci(n);
        System.out.println(res);
    }

    private static int findNthFibonacci(int n) {
        int[] fib = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

}
