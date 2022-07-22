package Recursion.basic;

public class PrintNtoOne {
    private void printNtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNtoOne(n - 1);
    }
    public static void main(String[] args) {
        PrintNtoOne printNtoOne = new PrintNtoOne();
        printNtoOne.printNtoOne(8);
    }
}
