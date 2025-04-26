class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int rowCount = grid.length, colCount = grid[0].length;
        for(int r=0; r<rowCount; r++){
            for(int c=0; c<colCount; c++){
                if(grid[r][c] == '1'){
                    bfs(r, c, rowCount, colCount, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void bfs(int row, int col, int rowCount, int colCount, char[][] grid){
        if(row < 0 || row >= rowCount || col < 0 || col >= colCount || grid[row][col] == '0') return;
        grid[row][col] = '0';
        bfs(row+1, col, rowCount, colCount, grid);
        bfs(row-1, col, rowCount, colCount, grid);
        bfs(row, col+1, rowCount, colCount, grid);
        bfs(row, col-1, rowCount, colCount, grid);
    }
}