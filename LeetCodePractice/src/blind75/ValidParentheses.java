package blind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static final String OPEN_BRACKETS = "([{";
    public static final String CLOSING_BRACKETS = ")]}";
    public static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(isOpeningBracket(c)) {
                stack.push(c);
            }
            else if(stack.isEmpty() || !isMatching(stack.pop(), c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpeningBracket(char c) {
        return OPEN_BRACKETS.indexOf(c) != -1;
    }
    public static boolean isMatching(char open, char close) {
        return OPEN_BRACKETS.indexOf(open) == CLOSING_BRACKETS.indexOf(close);
    }

    public static void main(String[] args) {
        String s = "[]{}{{";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
