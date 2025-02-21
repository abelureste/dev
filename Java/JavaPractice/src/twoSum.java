import java.util.Arrays;        //Arrays method is only needed to use .toString for our println

public class twoSum {
    public static void main (String[] args) {
        int[] array = {3, 4, 6, 7};
        int target = 10;

        System.out.println(Arrays.toString(twoSumBRUTEFORCE(array, target)));         //Arrays method only needed for this
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
}
