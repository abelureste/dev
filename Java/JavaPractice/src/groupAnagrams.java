import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class groupAnagrams {
    public static void main (String[] args) {
        String strs[] = {"act","pots","tops","cat","stop","hat"};

        System.out.println(groupAnagramsBRUTEFORCE(strs));
    }

    public static List<List<String>> groupAnagramsBRUTEFORCE(String[] strs) {
        HashMap<String, List<String>> temp = new HashMap<>();

        for(String i : strs) {
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String sortedI = new String(charArray);
            temp.putIfAbsent(sortedI, new ArrayList<>());
            temp.get(sortedI).add(i);
        }

        return new ArrayList<>(temp.values());
    }
}
