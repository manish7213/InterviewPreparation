package Recursion.basic;

public class PrintNTimes {

    private void printNTimes(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Manish");
        printNTimes(n - 1);
    }

    public static void main(String[] args) {
        PrintNTimes printNTimes = new PrintNTimes();
        printNTimes.printNTimes(4);

    }
}
