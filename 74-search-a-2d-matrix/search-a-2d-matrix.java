class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix[0].length;
        if(matrix.length == 0 || len == 0)
            return false;
        for (int i=0; i<matrix.length; i++){
            int exists = Arrays.binarySearch(matrix[i], target);
            if(exists >= 0)
                return true;
        }
        return false;
    }
}