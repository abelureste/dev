import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static void main (String[] args) {
        String strs[] = {"act","pots","tops","cat","stop","hat"};
    }

    public List<List<String>> groupAnagramsBRUTEFORCE(String[] strs) {
        HashMap<String, Integer> temp = new HashMap<String, Integer>();

        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < strs[i].length(); j++) {
                temp.put(strs[i], j);
            }
        }

        for 
    }
}
