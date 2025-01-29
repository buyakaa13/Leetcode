class Solution {
    static class Pair{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, 1, 0, -1};

    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        else if(grid.length == 1 && grid[0].length == 1)
            return grid[0][0];
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[rowCount][colCount];
        for(int i=0; i<rowCount; i++){
            for(int j=0; j<colCount; j++){
                if(!visited[i][j] && grid[i][j] == 1) 
                    maxArea = Math.max(bfs(i, j, visited, rowCount, colCount, grid), maxArea);
            }
        }
        return maxArea;
    }

     static boolean isValid(int row, int col, boolean[][] visited, int rowCount, int colCount){
        if(row < 0 || col < 0 || row >=rowCount || col >=colCount ) return false;
        if(visited[row][col]) return false;
        return true;
    }

    public static int bfs(int row, int col, boolean[][] visited, int rowCount, int colCount, int[][] grid){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col));
        visited[row][col] = true;

        int sum = 1;
        while(!queue.isEmpty()){
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;
            for(int i=0; i<4; i++){
                int adjX = x + dRow[i];
                int adjY = y + dCol[i];
                if(isValid(adjX, adjY, visited, rowCount, colCount) && grid[adjX][adjY] == 1){
                    queue.add(new Pair(adjX, adjY));
                    visited[adjX][adjY] = true;
                    sum += grid[adjX][adjY];
                }
            }
        }
        return sum;
    }
}