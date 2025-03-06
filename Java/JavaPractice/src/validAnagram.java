import java.util.Stack;

public class validAnagram {
    public static void main (String[] args){
        String s = "racecar";
        String t = "carrace";

        System.out.print(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        Stack<Character> temp = new Stack<Character>();

        char[] sArray = s.toCharArray();

        for(char i : sArray) {
            temp.push(i);
        }

        String result = "";
        while (!temp.isEmpty()) {
            result = temp.pop() + result;
        }
        System.out.print(result);
        if(result == t) {
            return true;
        }

        else return false;
    }
}
