class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++)
            sum += nums[i];
        if(sum % 2 != 0) return false;
        int targetSum = sum / 2;
        boolean[] dp = new boolean[targetSum+1];
        dp[0] = true;
        for(int num: nums){
            for(int currentSum = targetSum; currentSum >= num; currentSum--)
                dp[currentSum] = dp[currentSum] | dp[currentSum - num];
        }
        return dp[targetSum];
    }
}