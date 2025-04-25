class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int len = grid.length;
        if(grid[0][0] == 1 || grid[len-1][len-1] == 1) return -1;
        int count = 1;
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] current = queue.poll();
                if(current[0] == len-1 && current[1] == len-1 ) return count;
                for(int[] dir: directions){
                    int row = current[0]+dir[0];
                    int col = current[1]+dir[1];
                    if(row < 0 || row >= len || col < 0 || col >= len || grid[row][col] == 1) continue;
                    queue.offer(new int[]{row, col});
                    grid[row][col] = 1; 
                }
            }
            count++;
        }
        return -1;
    }
}