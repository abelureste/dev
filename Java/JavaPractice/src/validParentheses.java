import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s = "([{}])";

        System.out.println(isValidBruteForce(s));
        System.out.println(isValidStack(s));
    }

    public static boolean isValidBruteForce(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        
        return s.isEmpty();
    }

    public static boolean isValidStack(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for(char i : s.toCharArray()) {
            if(closeToOpen.containsKey(i)) {
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(i)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(i);
            }
            System.out.println(stack);
        }

        return stack.isEmpty();
    }
}
