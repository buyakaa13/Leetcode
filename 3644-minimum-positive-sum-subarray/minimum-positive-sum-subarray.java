class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) 
            prefixSum[i + 1] = prefixSum[i] + nums.get(i);
        
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i <= n - l; i++) {
            for (int j = i + l; j <= Math.min(i + r, n); j++) {
                int currentSum = prefixSum[j] - prefixSum[i];
                if (currentSum > 0 && currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }
        
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}