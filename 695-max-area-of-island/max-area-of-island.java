class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && grid[i][j] == 1)
                    maxArea = Math.max(bfs(grid, visited, i, j), maxArea);
            }
        }
        return maxArea;
    }

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int bfs(int[][] grid, boolean[][] visited, int row, int col){
        int area = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        visited[row][col] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            for(int i=0; i<directions.length; i++){
                int rowNeighbor = r+directions[i][0];
                int colNeighbor = c+directions[i][1];
                if(rowNeighbor >= 0 && rowNeighbor < grid.length && colNeighbor >= 0 && colNeighbor < grid[0].length && !visited[rowNeighbor][colNeighbor] && grid[rowNeighbor][colNeighbor] == 1){
                    queue.add(new int[]{rowNeighbor, colNeighbor});
                    visited[rowNeighbor][colNeighbor] = true;
                    area++;
                }
            }
        }
        return area;
    }
}