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
        Queue<int[]> queue = new LinkedList();
        queue.offer(new int[]{row, col});
        grid[row][col] = '0';

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0], c = current[1];
            if(r+1 < rowCount && grid[r+1][c] == '1'){
                queue.offer(new int[]{r+1, c});
                grid[r+1][c] = '0';
            }

            if(c+1 < colCount && grid[r][c+1] == '1'){
                queue.offer(new int[]{r, c+1});
                grid[r][c+1] = '0';
            }

            if(r-1 >= 0 && grid[r-1][c] == '1'){
                queue.offer(new int[]{r-1, c});
                grid[r-1][c] = '0';
            }

            if(c-1 >= 0 && grid[r][c-1] == '1'){
                queue.offer(new int[]{r, c-1});
                grid[r][c-1] = '0';
            }
        }
    }
}