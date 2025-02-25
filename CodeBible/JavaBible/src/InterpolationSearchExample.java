public class InterpolationSearchExample {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        System.out.println("Element found at index: " + InterpolationSearch(arr, 512));
    }

    public static int InterpolationSearch(int[] array, int target){
        int high = array.length - 1;
        int low = 0;

        while(target >= array[low] && target <= array[high] && low <= high) {

            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if(array[probe] == target){
                return probe;
            } else if(array[probe] < target){
                low = probe + 1;
            } else {
                high = probe - 1;
            }
         }

         return -1;
    }
}
