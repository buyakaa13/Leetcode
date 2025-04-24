class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0, time = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1)
                    fresh++;
                else if(grid[i][j] == 2)
                    queue.offer(new int[]{i, j});
            }
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while(fresh > 0 && !queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];
                for(int[] dir: directions){
                    int row = dir[0] + r;
                    int col = dir[1] + c;
                    if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1){
                        grid[row][col] = 2;
                        queue.offer(new int[]{row, col});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}