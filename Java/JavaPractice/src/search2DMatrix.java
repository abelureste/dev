public class search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;

        System.out.println(searchMatrixBRUTEFORCE(matrix, target));
    }

    public static boolean searchMatrixBRUTEFORCE(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++){
            System.out.println("Outer loop iteration: " + i);
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Inner loop iteration: " + j);
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean searchMatrixEFFICIENT(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] > target) {
                int[] splitArray = matrix[i - 1];
            }
        }
    } 
}
