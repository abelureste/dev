import java.util.HashMap;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println(containsDuplicateBRUTEFORCE(array));
        System.out.println(containsDuplicateEFFICIENT(array));
        
    }

    public static boolean containsDuplicateBRUTEFORCE(int[] nums){        //O(n^2)
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateEFFICIENT(int[] nums){          //O(n)
        HashMap<Integer, Integer> prevNums = new HashMap<Integer, Integer>();       //Initalize hashmap

        for(int i = 0; i < nums.length; i++){               //Loop through array n times
            if(prevNums.containsValue(nums[i])){            //Check if our previous numbers hashmap already contains same value at index i in nums array
                return true;                                //Return true
            }

            prevNums.put(i, nums[i]);                       //Add the index i as our hashmap key and nums[i] as our hashmap value
        }

        return false;
    }
}