class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                
                for (int[] dir : directions) {
                    int row = current[0] + dir[0];
                    int col = current[1] + dir[1];
                    
                    if (row < 0 || row >= rows || col < 0 || col >= cols)
                        continue;
                    if (maze[row][col] == '+')
                        continue;
                    if (row == 0 || row == rows - 1 || col == 0 || col == cols - 1) {
                        if (!(row == entrance[0] && col == entrance[1])) {
                            return steps;
                        }
                    }
                    maze[row][col] = '+';
                    queue.offer(new int[]{row, col});
                }
            }
        }
        return -1;
    }
}