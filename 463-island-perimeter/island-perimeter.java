class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int[][] directions = {{0,1}, {1,0}, {-1,0}, {0, -1}};
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) continue;
                for(int[] dir: directions){
                    int row = i + dir[0];
                    int col = j + dir[1];
                    if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) perimeter++;
                    // if(row == 0 || row == grid.length-1) 
                    //     perimeter++;
                    // if(col == 0 || col == grid[0].length-1) 
                    //     perimeter++;
                    else if(grid[row][col] == 0)
                        perimeter++;
                }
            }
        }
        return perimeter;
    }
}