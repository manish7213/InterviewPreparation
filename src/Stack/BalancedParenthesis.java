package Stack;

import java.util.Stack;


public class BalancedParenthesis {

    public static void main(String[] args) {
//        String str = "()([])";
        String str = "(])";
        System.out.println(isBalanced(str));

    }

    private static boolean isBalanced(String str) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isOpening(c)) {
                characterStack.push(c);
                continue;
            }

            if (characterStack.isEmpty()) {
                return false;
            }

            if ((characterStack.peek() == '(' && c == ')')
                    || (characterStack.peek() == '{' && c == '}')
                    || (characterStack.peek() == '[' && c == ']')
            ) {
                characterStack.pop();
            } else {
                return false;
            }

        }

        return characterStack.isEmpty();


    }

    private static boolean isOpening(char c) {

        return c == '(' || c == '{' || c == '[';
    }

    private static boolean isMatching(char c1, char c2) {
        if ((c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']')) {
            return true;
        }

        return false;
    }


}
