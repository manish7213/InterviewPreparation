package BitManipulation;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 9;
        int b = 999;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a is : " + a + " and b is : " + b);
    }
}
