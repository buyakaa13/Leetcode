class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length == 1) return cost[0];
        Arrays.sort(cost);
        int sum = 0;
        for(int i=0; i<cost.length; i++)
            sum += cost[i];
        for(int i=cost.length-3; i>=0; i-=3)
            sum-=cost[i];
        return sum;
    }
}