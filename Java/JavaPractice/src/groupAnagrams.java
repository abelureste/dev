import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class groupAnagrams {
    public static void main (String[] args) {
        String strs[] = {"act","pots","tops","cat","stop","hat"};

        System.out.println(groupAnagramsSorting(strs));
        System.out.println(groupAnagramsHashTable(strs));
    }

    public static List<List<String>> groupAnagramsSorting(String[] strings) {
        HashMap<String, List<String>> temp = new HashMap<>();

        for(String i : strings) {
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String sortedI = new String(charArray);
            temp.putIfAbsent(sortedI, new ArrayList<>());
            temp.get(sortedI).add(i);
        }
        return new ArrayList<>(temp.values());
        
    }

    public static List<List<String>> groupAnagramsHashTable(String[] strings){
        HashMap<String, List<String>> result = new HashMap<>();

        for(String i : strings) {
            int[] count = new int[26];
            for(char j : i.toCharArray()){
                count[j - 'a']++;
            }
            String key = Arrays.toString(count);
            System.out.println(key);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(i);
        }
        return new ArrayList<>(result.values());
    }
}
