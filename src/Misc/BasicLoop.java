package Misc;

import java.util.Arrays;
import java.util.List;

public class BasicLoop {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 5, 6, 7, 8, 9, 0);
        int[] numbers = {1, 2, 3, 4, 5};
        long count = Arrays.stream(numbers).distinct().count();
    }
}
