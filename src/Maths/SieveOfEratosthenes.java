package Maths;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] isPrime = seiveOfEratosthenes(20);
        int count = 0;
        for (boolean prime : isPrime) {
            System.out.println(count + " " + prime);
            count++;
        }
    }

    private static boolean[] seiveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }

}
