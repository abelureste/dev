public class SelectionSortExample {
    public static void main(String[] args){
        int[] arr = {8, 256, 4, 16, 512, 32, 64, 128, 2, 1024, 1};

        selectionSort(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
        
    }

    public static void selectionSort(int array[]) {

        for(int i = 0; i < array.length - 1; i++){
            int min = 1;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
