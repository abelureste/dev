
public class validPalindrome {
    public static void main(String[] args) {
        String s = "tab a cat";
        
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        char[] charArray = s.toCharArray();
        for(char i : charArray) {
            if(Character.isLetterOrDigit(i)){
                temp.append(Character.toLowerCase(i));
            }
        }
        
        if(temp.toString().equals(temp.reverse().toString())) {
            return true;
        }

        return false;
    }
}
