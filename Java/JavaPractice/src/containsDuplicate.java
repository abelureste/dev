public class containsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3};

        System.out.println(containsDuplicateBRUTEFORCE(array));
        
    }

    public static boolean containsDuplicateBRUTEFORCE(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
