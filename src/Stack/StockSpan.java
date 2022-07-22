package Stack;

import java.util.Arrays;
import java.util.Stack;

// Similar to shadow of sun from right
// Similar to Next greater element to the left
public class StockSpan {

    public static void main(String[] args) {
        int[] input = {1, 1, 3, 4, 5, 6, 1};
        int[] res = new int[input.length];
        res = findNextGreaterElementToTheLeft(input);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findNextGreaterElementToTheLeft(int[] input) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[input.length];
        stack.push(0);
        res[0] = 1;
        for (int i = 1; i < input.length; i++) {
            while (!stack.empty() && input[stack.peek()] < input[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - stack.peek();
            }

            stack.push(i);
        }
        return res;
    }

}
