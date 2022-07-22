package Stack;

import java.util.Stack;

public class DuplicateParenthesis {

    public static void main(String[] args) {
//        String str = "((a+b) + (b+c))";
        String str = "((a+b) + ((b+c)))";
        boolean isDuplicate = hasDuplicateParenthesis(str);
        System.out.println(isDuplicate);

    }

    private static boolean hasDuplicateParenthesis(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(expr.charAt(i));
            }
        }

        return false;
    }
}
