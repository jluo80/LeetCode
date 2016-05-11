public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean result = false;
        for (int i = 0; i < row; i++){
            if (target >= matrix[i][0] && target <= matrix[i][col-1]){
                result = Arrays.binarySearch(matrix[i], target) >= 0;
            }
        }
        return result;
    }
}