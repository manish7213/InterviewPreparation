package Misc;

import java.util.List;

public class BasicLoop {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 5, 6, 7, 8, 9, 0);

        for (int n : list) {
            if (n == 7) {
                System.out.println(n + " In the IF statement");
                break;
            }

            System.out.println(n + " Outside of IF but within FOR");

        }

        System.out.println("Outside of FOR");
    }
}
