public class BinarySearchExample {
    public static void main(String[] args){
        int[] arr = {20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println(BinarySearch(arr, 80));

    }

    public static int BinarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
             int middle = low + (high - low) / 2;
             int value = array[middle];
             
             if(value < target) low = middle + 1;
             else if (value > target) high = middle -1;
             else return middle; 
        }
        return 0;
    }
}
