public class InsertionSortExample {
    public static void main(String[] args){
        int[] arr = {8, 256, 4, 16, 512, 32, 64, 128, 2, 1024, 1};

        insertionSort(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
            }
    }
}
