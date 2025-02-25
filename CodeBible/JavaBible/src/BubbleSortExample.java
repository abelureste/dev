public class BubbleSortExample {
    public static void main(String[] args){
        int[] arr = {8, 256, 4, 16, 512, 32, 64, 128, 2, 1024, 1};

        bubbleSort(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
        
    }

    public static void bubbleSort(int array[]) {

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
