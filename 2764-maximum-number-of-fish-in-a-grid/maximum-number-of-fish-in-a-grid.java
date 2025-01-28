class Solution {
    static class Pair{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int dRow[] = {-1, 0, 1, 0};
    static int dCol[] = {0, 1, 0, -1};

    static boolean isValid(boolean[][] visited, int row, int col, int totalRow, int totalCol){
        if(row < 0 || col < 0 || col >= totalCol || row >= totalRow)
            return false;
        if(visited[row][col]) return false;
        return true;
    }

    public int findMaxFish(int[][] grid) {
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int max = 0;
        boolean[][] visited = new boolean[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (!visited[i][j] && grid[i][j] > 0) {
                    max = Math.max(max, bfs(grid, visited, i, j));
                }
            }
        }
        return max;
    }

    private int bfs(int[][] grid, boolean[][] visited, int startX, int startY) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startX, startY));
        visited[startX][startY] = true;
        int sum = 0;
        while (!q.isEmpty()) {
            Pair cell = q.poll();
            int x = cell.x;
            int y = cell.y;
            sum += grid[x][y];
            for (int i = 0; i < 4; i++) {
                int adjX = x + dRow[i];
                int adjY = y + dCol[i];
                if (isValid(visited, adjX, adjY, grid.length, grid[0].length) && grid[adjX][adjY] > 0) {
                    q.add(new Pair(adjX, adjY));
                    visited[adjX][adjY] = true;
                }
            }
        }
        return sum;
    }
}