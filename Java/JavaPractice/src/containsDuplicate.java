import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println(containsDuplicateBruteForce(array));
        System.out.println(containsDuplicateSorting(array));
        System.out.println(containsDuplicateHashMap(array));
        
    }

    public static boolean containsDuplicateBruteForce(int[] nums){        //O(n^2)
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateSorting(int[] nums){
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    public static boolean containsDuplicateHashMap(int[] nums){          //O(n)
        HashMap<Integer, Integer> prevNums = new HashMap<Integer, Integer>();       //Initalize hashmap

        for(int i = 0; i < nums.length; i++){               //Loop through array n times
            if(prevNums.containsValue(nums[i])){            //Check if our previous numbers hashmap already contains same value at index i in nums array
                return true;                                //Return true
            }

            prevNums.put(i, nums[i]);                       //Add the index i as our hashmap key and nums[i] as our hashmap value
        }

        return false;
    }

    public static boolean containsDuplicateHashSet(int[] nums){
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}