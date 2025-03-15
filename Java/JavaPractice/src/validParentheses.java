import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s = "([{}])";

        System.out.println(isValidBRUTEFORCE(s));
        System.out.println(isValidEFFICIENT(s));
    }

    public static boolean isValidBRUTEFORCE(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        if(s.isEmpty()) {
            return true;
        }
        
        else return false;
    }

    public static boolean isValidEFFICIENT(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']' , '[');
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
        }

        return stack.isEmpty();
    }
}
