package Recursion.basic;

public class SumOfNNumbers {

    private int sumOfNNumbers(int n) {

        if (n == 0) {
            return 0;
        }
        return n + sumOfNNumbers(n - 1);

    }

    public static void main(String[] args) {
        SumOfNNumbers sumOfNNumbers = new SumOfNNumbers();
        int res = sumOfNNumbers.sumOfNNumbers(5);
        System.out.println(res);

    }
}
