package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        String source = "src";
        String helper = "helper";
        String destination = "dest";
        towerOfHanoi(n, source, helper, destination);
    }

    private static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " From " + source + " To " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Transfer Disk " + n + " From " + source + " To " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }
}
