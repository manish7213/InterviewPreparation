package BitManipulation;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isOddOrEven(input));
    }

    private static String isOddOrEven(int input) {
        String res = "";
        if ((input & 1)== 0) {
            res = "Even";
        } else {
            res = "Odd";
        }

        return res;
    }
}
