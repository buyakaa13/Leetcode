class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer, int[]> zeros = new HashMap<>();
        int colCount = matrix[0].length;
        int rowCount = matrix.length;
        int counter = 0;
        for(int i=0; i<rowCount; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0)
                    zeros.put(counter, new int[]{i, j});
                counter++;
            }
        }

        for (Map.Entry<Integer, int[]> map: zeros.entrySet()){
            System.out.println("map: " + map.getValue()[0] + " " + map.getValue()[1]);
            for (int i=0; i<rowCount; i++)
                matrix[i][map.getValue()[1]] = 0;
            for(int j=0; j<colCount; j++)
                matrix[map.getValue()[0]][j] = 0;
        }
    }
}