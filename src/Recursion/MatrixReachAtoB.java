package Recursion;

/**
 * Number of ways to reach at the end of the matrix , given you can move only right and down.
 */
public class MatrixReachAtoB {

    private static int noOfWays(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }

        return noOfWays(n - 1, m) + noOfWays(n, m - 1);
    }

    public static void main(String[] args) {
        int i = noOfWays(4, 5);
        System.out.println(i);
    }
}
