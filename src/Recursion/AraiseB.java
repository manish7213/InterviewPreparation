package Recursion;

public class AraiseB {

    public static void main(String[] args) {
        System.out.println(aPowB(3, 4));
    }

    private static int aPowB(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * aPowB(a, b - 1);
    }
}
