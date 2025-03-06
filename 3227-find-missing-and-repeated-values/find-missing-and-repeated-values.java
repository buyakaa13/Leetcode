class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        if(len < 2) return new int[]{};
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                int key = grid[i][j];
                map.put(key, map.getOrDefault(key, 0)+1);
            }
        }
        int ans[] = new int[2];
        for(int i=1; i<=len*len; i++){
            int val = map.getOrDefault(i, 0);
            if(val == 0)
                ans[1] = i;
            else if(val == 2)
                ans[0] = i;
        }
        return ans;
    }
}