class Solution {
    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, 1, 0, -1};

    static boolean isValid(int row, int col, int rowCount, int colCount){
        if(row < 0 || col < 0 || row >= rowCount || col >= colCount) return false;
        return true;
    }

    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0) return 0;
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int p = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1)
                    p += BFS(i, j, rowCount, colCount, grid);
            }
        }
        return p;
    }

    public int BFS(int row, int col, int rowCount, int colCount, int[][] grid){
        int count = 4;
        for(int i=0; i<4; i++){
            int adjX = row + dRow[i];
            int adjY = col + dCol[i];
            if(isValid(adjX, adjY, rowCount, colCount) && grid[adjX][adjY] == 1){
                count--;
            }
        }
        return count;
    }
}