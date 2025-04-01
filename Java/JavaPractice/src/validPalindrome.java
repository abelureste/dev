
public class validPalindrome {
    public static void main(String[] args) {
        String s = "taco cat";
        
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeTwoPointers(s));
    }

    public static boolean isPalindrome(String array) {
        StringBuilder newStr = new StringBuilder();
        for (char i : array.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                newStr.append(Character.toLowerCase(i));
            }
        }

        return newStr.toString().equals(newStr.reverse().toString());
    }

    public static boolean isPalindromeTwoPointers(String array){
        int left = 0, right = array.length() - 1;

        while(left < right){
            while(left < right && !alphaNumeric(array.charAt(left))){
                left++;
            }
            while(right > left && !alphaNumeric(array.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(array.charAt(left)) != Character.toLowerCase(array.charAt(right))){
                return false;  
            } 
            left++; 
            right--;
        }
        return true;
    }

    public static boolean alphaNumeric(char c){
        return(c >= 'A' && c <= 'Z' ||
               c >= 'a' && c <= 'z' ||
               c >= '0' && c <= '9');
    }
}
