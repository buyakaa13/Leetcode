class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix[0].length;
        if(matrix.length == 0 || len == 0)
            return false;
        for (int i=0; i<matrix.length; i++){
            int low = 0;
            int high = matrix[i].length - 1;
            while(low<=high){
                int mid = (low + high) / 2;
                int midValue = matrix[i][mid];
                if(midValue == target)
                    return true;
                else if(midValue < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}