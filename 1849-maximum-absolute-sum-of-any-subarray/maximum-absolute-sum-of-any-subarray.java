class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentMaxSum = nums[0];
        int maxSum = nums[0];
        int currentMinSum = nums[0];
        int minSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currentMaxSum = Math.max(currentMaxSum+nums[i], nums[i]);
            maxSum = Math.max(currentMaxSum, maxSum);
            currentMinSum = Math.min(currentMinSum+nums[i], nums[i]);
            minSum = Math.min(currentMinSum, minSum);
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}