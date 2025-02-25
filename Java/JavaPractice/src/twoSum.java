import java.util.Arrays;        //Arrays method is only needed to use .toString for our println
import java.util.HashMap;       //Needed for efficient method, O(n)

public class twoSum {
    public static void main (String[] args) {
        int[] array = {3, 4, 5, 6};
        int target = 7;

        System.out.println(Arrays.toString(twoSumBRUTEFORCE(array, target)));         //Arrays method only needed for this
        System.out.println(Arrays.toString(twoSumEFFICIENT(array, target)));          //Arrays method only needed for this
    }

    public static int[] twoSumBRUTEFORCE(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumEFFICIENT(int[] nums, int target){
        HashMap<Integer, Integer> prevNums = new HashMap<Integer, Integer>();       //Intialize hashmap

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];                          //Find the difference between value at index i and target

            if(prevNums.containsKey(difference)) {                    //If our hashmap contains a number equal to the difference 
                return new int[] {prevNums.get(difference), i};         //Return the index that the difference number is at, and the index we are at in the array
            }

            prevNums.put(nums[i], i);           //Add the difference value as our hashmap key and the index i as our hashmap value
        }

        return new int[0];
    }
}
