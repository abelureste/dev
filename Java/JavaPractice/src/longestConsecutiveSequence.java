import java.util.HashSet;


public class longestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};

        System.out.println(longestConsecutiveBRUTEFORCE(nums));
    }

    public static int longestConsecutiveBRUTEFORCE(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        int result = 0;

        for(int i : nums) {
            numbers.add(i);
        }

        for(int i : numbers){
            int consecutive = 0, current = i;
            while(numbers.contains(current)){
                consecutive++;
                current++;
            }
            result = Math.max(result, consecutive);
        }
        return result;
    }

    public static int longestConsecutiveEFFICIENT(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if(i > currentNum){
                
            }
        }

        int inte = 0;
        return inte;
    }
}
