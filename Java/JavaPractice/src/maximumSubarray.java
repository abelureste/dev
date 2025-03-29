public class maximumSubarray {
    public static void main (String[] args) {
        int[] nums = {2,-3,4,-2,2,1,-1,4};

        System.out.println(maximumSubarrayBruteForce(nums));

    }

    public static int maximumSubarrayBruteForce(int[] array){
        int result = array[0];

        for(int i = 0; i < array.length; i++) {
            int current = 0;
            System.out.println("Outer Iteration: " + i + " , Current: " + current);
            for(int j = i; j < array.length; j++) {
                current = array[j] + current;
                result = Math.max(result, current);
                System.out.println("Inner Iteration: " + j + " , Current: " + current + " , Result: " + result);
            }
        }

        return result;
    }
}
