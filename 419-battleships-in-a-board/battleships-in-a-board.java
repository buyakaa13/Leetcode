class Solution {
    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, 1, 0, -1};

    static class Pair{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static boolean isValid(int row, int col, int rowCount, int colCount, boolean[][] visited){
        if(row < 0 || col < 0 || row >= rowCount || col >= colCount) return false;
        if(visited[row][col]) return false;
        return true;
    }

    public int countBattleships(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return 0;
        int rowCount = board.length;
        int colCount = board[0].length;
        boolean[][] visited = new boolean[rowCount][colCount];
        int count = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(!visited[i][j] && board[i][j] == 'X'){
                    BFS(i, j, rowCount, colCount, visited, board);
                    count++;
                }
            }
        }
        return count;
    }

    static void BFS(int row, int col, int rowCount, int colCount, boolean[][] visited, char[][] board){
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
                if(isValid(adjX, adjY, rowCount, colCount, visited) && board[adjX][adjY] == 'X'){
                    queue.add(new Pair(adjX, adjY));
                    visited[adjX][adjY] = true;
                }
            }
        }
    }
}