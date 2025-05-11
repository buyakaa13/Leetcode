class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{0,1}, {1,0}, {0, -1}, {-1, 0}};

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(mat[i][j] == 0)
                    queue.add(new int[]{i, j});
                else
                    mat[i][j] = Integer.MAX_VALUE;
            }
        }

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            for(int[] direction: directions){
                int rNeighbor = r+direction[0];
                int cNeighbor = c+direction[1];
                if(rNeighbor >= 0 && rNeighbor < row && cNeighbor >= 0 && cNeighbor < col && mat[rNeighbor][cNeighbor] > mat[r][c]+1){
                    mat[rNeighbor][cNeighbor] = mat[r][c]+1;
                    queue.add(new int[]{rNeighbor, cNeighbor});
                }
            }
        }
        return mat;
    }
}