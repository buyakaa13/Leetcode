class Solution {
    int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c] == '1'){
                    dfs(r, c, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(int row, int col, char[][] grid){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') return;
        grid[row][col] = '0';
        for(int[] dir: directions){
            dfs(row+dir[0], col+dir[1], grid);
        }
    }
}