import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] inputarray = {1,2,2,3,3,3};


    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyCount = new HashMap<Integer, Integer>();

        for(int i : nums){
            frequencyCount.put(nums[i], frequencyCount.getOrDefault(i, 0) + 1);
        }
        
    }
}