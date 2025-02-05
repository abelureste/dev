public class O1 {
    public static int getFirstElement(int[] arrayIndex) {
        if (arrayIndex.length == 0) {           //O(1) because regardless of array size, the amount of operations is the same, 1
            return -1;
        }
        return arrayIndex[0];
    }

    public static void main (String [] args) {
        int[] simpleArray = {1, 2, 3, 4, 5};

        System.out.println(getFirstElement(simpleArray));
    }
}