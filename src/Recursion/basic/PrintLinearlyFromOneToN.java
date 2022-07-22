package Recursion.basic;

public class PrintLinearlyFromOneToN {

    private void printOneToN(int n) {

        if (n == 0) {
            return;
        }

        printOneToN(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args) {
        PrintLinearlyFromOneToN printLinearlyFromOneToN = new PrintLinearlyFromOneToN();
        printLinearlyFromOneToN.printOneToN(9);

    }

}
