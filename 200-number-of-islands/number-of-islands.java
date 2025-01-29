class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int landCount = 0;
        boolean visited[][] = new boolean[rowCount][colCount];
        for(int i=0; i<rowCount; i++){
            for(int j=0; j<colCount; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    BFS(i, j, grid, visited, rowCount, colCount);
                    landCount++;
                }
            }
        }
        return landCount;
    }

    public class Pair{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int[] dRow = new int[]{-1, 0, 1, 0};
    static int[] dCol = new int[]{0, 1, 0, -1};

    static boolean isValid(int row, int col, int rowCount, int colCount, boolean[][] visited){
        if(row < 0 || col < 0 || row >= rowCount || col >= colCount) return false;
        if(visited[row][col]) return false;
        return true;
    }

    public void BFS(int row, int col, char[][] grid, boolean[][] visited, int rowCount, int colCount){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col));
        visited[row][col] = true;

        while(!queue.isEmpty()){
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;
            for(int i=0; i<4; i++){
                int adjX = x + dRow[i];
                int adjY = y + dCol[i];
                if(isValid(adjX, adjY, rowCount, colCount, visited) && grid[adjX][adjY] == '1'){
                    queue.add(new Pair(adjX, adjY));
                    visited[adjX][adjY] = true;
                }
            }
        }
    }
}