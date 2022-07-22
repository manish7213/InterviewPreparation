package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextLesserElementToTheRight {

    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] res = findNextLesserElementToTheRight(arr);
        System.out.println(Arrays.toString(res));
//        Expected Output : [1, 3, 3, 1, -1, 6, -1, 7, -1]
    }

    private static int[] findNextLesserElementToTheRight(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        stack.push(arr[arr.length - 1]);
        res[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return res;
    }
}
