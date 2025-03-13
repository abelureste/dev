import java.util.Arrays;
import java.util.HashMap;

public class validAnagram {
    public static void main (String[] args){
        String s = "racecar";
        String t = "carrace";

        System.out.println(isAnagramBRUTEFORCE(s, t));
        System.out.println(isAnagramEFFICIENT(s, t));
    }

    public static boolean isAnagramBRUTEFORCE(String s, String t){
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        if(Arrays.equals(sArray, tArray)) {
            return true;
        }

        else return false;
    }

    public static boolean isAnagramEFFICIENT(String s, String t){
        if(s.length() != t.length()) {
            return false;
        }
 
        HashMap<Character, Integer> sortedS = new HashMap<>();
        HashMap<Character, Integer> sortedT = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            sortedS.put(s.charAt(i), sortedS.getOrDefault(s.charAt(i), 0) + 1);
            sortedT.put(t.charAt(i), sortedT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sortedS.equals(sortedT);

    }
}
