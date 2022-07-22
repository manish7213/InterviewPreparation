package Recursion.basic;

public class AraiseB {

    public static void main(String[] args) {

        System.out.println(aPowB(3, 4));
        System.out.println(aPowB(3, 0));
        System.out.println(aPowB(3, 1));
        System.out.println(aPowB(27, 2));
    }

    private static int aPowB(int a, int b) {
        if (b == 0) {
            return 1;
        }

        if (b == 1) {
            return a;
        }

        return aPowB(a, b - 1) * aPowB(a, 1);
    }
}
