public class LinearSearchExample {
    public static int LinearSearch(int arrayExample[], int arrayLength, int targetValue) {
        for(int i = 0; i < arrayLength; i++)
            if(arrayExample[i] == targetValue) {
                return i;
            }
        return -1;
    }
    
    public static void main (String[] args){ 
        int arrayExample[] = {5, 10, 15, 20, 25};
        int targetValue = 20;

        int result = LinearSearch(arrayExample, arrayExample.length, targetValue);
        if (result == -1) {
            System.out.println("Your target value is not in the array.");          
        } else {
            System.out.println("Your value is at index: " + result);
        } 
    } 
}
