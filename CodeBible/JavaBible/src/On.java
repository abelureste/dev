public class On {
    public static int calculateSumTraditional(int[] arrayIndex) {
        int sum = 0;
        for (int i = 0; i < arrayIndex.length; i++){        //Traditional for loop (for ( [initialization]; [condition]; [update] ))
            sum += arrayIndex[i];                           //In this example:     (for ( [int i = 0]; [i < arrayIndex.length]; [i++]))
        }
        return sum;
    }

    public static int calculateSumEnhanced(int[] arrayIndex) {
        int sum = 0;
        for (int num : arrayIndex) {                        //Enhanced for loop (for ( [dataType] [variable] : [array] ))
            sum += num;                                     //In this example:  (for (int num : arrayIndex))
        }
        return sum;
    }

    public static void main (String [] args) {
        int[] simpleArray = {1, 2, 3, 4, 5};

        System.out.println("Using Traditional For loop: " + calculateSumTraditional(simpleArray));
        System.out.println("Using Enhanced For loop: " + calculateSumEnhanced(simpleArray));
    }
}