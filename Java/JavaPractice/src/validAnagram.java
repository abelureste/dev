import java.util.Arrays;

public class validAnagram {
    public static void main (String[] args){
        String s = "racecar";
        String t = "carrace";

        System.out.print(isAnagramBRUTEFORCE(s, t));
    }

    public static boolean isAnagramBRUTEFORCE(String s, String t){

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        String sSorted = new String(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        String tSorted = new String(tArray);

        System.out.println(sArray);
        System.out.println(tArray);

        if(sSorted.equals(tSorted)) {
            return true;
        }

        else return false;
    }
}
