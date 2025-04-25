class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        int[][] directions = {{0,1}, {1,0}, {-1,0}, {0,-1}};
        int steps = 0;
        while(!queue.isEmpty()){
            steps++;
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] current = queue.poll();
                for(int[] dir: directions){
                    int row = dir[0] + current[0];
                    int col = dir[1] + current[1];
                    System.out.println("row: " + row + " col: " + col + " step: " + steps);
                    if(row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) continue;
                    if(maze[row][col] == '+') continue;
                    if(row == 0 || row == maze.length-1 || col == 0 || col == maze[0].length-1) return steps;
                   
                    maze[row][col] = '+';
                    queue.offer(new int[]{row, col});
                }
            }
        }
        return -1;
    }
}