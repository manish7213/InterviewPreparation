package Recursion.basic;

import java.util.Arrays;

public class ReverseAnArray {

    private void reverseArray(int start, int[] numbers, int end) {
        if (start >= end) {
            return;
        }

        swap(start, numbers, end);
        reverseArray(start + 1, numbers, end - 1);
    }

    private void swap(int start, int[] numbers, int end) {
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
    }

    public static void main(String[] args) {
        ReverseAnArray anArray = new ReverseAnArray();
        int[] numbers = {1, 5, 3, 4, 5};
        anArray.reverseArray(0, numbers, 4);
        System.out.println(Arrays.toString(numbers));

    }
}
