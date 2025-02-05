public class Opower2 {
    public static int calculateSumOf2DArray(int[][] arrayIndex) {
        int sum = 0;
        for(int i = 0; i < arrayIndex.length; i++)
            for (int j = 0; j < arrayIndex[i].length; j++){
                sum += arrayIndex[i][j];
            }
        return sum;
    }

    public static void main (String [] args) {
        int[][] simpleArray2D = {{1, 2},{3, 4}};

        System.out.println(calculateSumOf2DArray(simpleArray2D));
    }
}