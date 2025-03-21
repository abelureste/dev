public class search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;

        System.out.println(searchMatrixBRUTEFORCE(matrix, target));
        System.out.println(searchMatrixEFFICIENT(matrix, target));
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
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0, right = rows * columns - 1;
        while (left <= right) {
            int middle = left + (right - 1) / 2;
            int row = middle / columns;
            int column = middle % columns;

            if(target > matrix[row][column]) {
                left = middle + 1;
            } else if (target < matrix[row][column]) {
                right = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    } 
}
