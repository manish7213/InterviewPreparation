package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementToTheRight {

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] res = findNextGreaterElementToTheRight(arr);
        System.out.println(Arrays.toString(res));
        // Expected Output : [5, 9, 12, 12, 12, -1, 8, -1, -1]

    }

    private static int[] findNextGreaterElementToTheRight(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && stack.peek() <= arr[i]) {
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
