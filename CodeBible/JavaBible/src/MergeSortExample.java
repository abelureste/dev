public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr = {8, 256, 4, 16, 512, 32, 64, 128, 2, 1024, 1};

        mergeSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        
        int length = arr.length;
        if (length <= 1 ) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i < length; i++){
            if(i < middle) {
                leftArray[i] = arr[i];
            } else {
                rightArray[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);

    }

    public static void merge(int[] leftArray, int[] rightArray, int[] arr) {
        
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            } else {
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize) {
            arr[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize) {
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
