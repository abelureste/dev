import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PRACTICE {
    public static void main(String[] args) {
        String s = "([{}])";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        while(s.contains("{}") || s.contains("[]") || s.contains("()")){
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }

        if(s.isEmpty()) {
            return true;
        }

        else return false;
    }
}

