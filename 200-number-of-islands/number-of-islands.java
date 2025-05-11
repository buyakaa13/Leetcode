class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    bfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public void bfs(char[][] grid, boolean[][] visited, int row, int col){
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
                if(rowNeighbor >= 0 && rowNeighbor < grid.length && colNeighbor >= 0 && colNeighbor < grid[0].length && !visited[rowNeighbor][colNeighbor] && grid[rowNeighbor][colNeighbor] == '1'){
                    queue.add(new int[]{rowNeighbor, colNeighbor});
                    visited[rowNeighbor][colNeighbor] = true;
                }
            }
        }
    }
}