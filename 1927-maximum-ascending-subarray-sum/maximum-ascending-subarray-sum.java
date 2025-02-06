class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 0) return 0;
        int sum = nums[0];
        int totalSum = nums[0];
        for(int i=1; i<nums.length; i++){
            sum = nums[i-1] >= nums[i] ? nums[i] : sum + nums[i];
            totalSum = Math.max(sum, totalSum);
        }
        return totalSum;
    }
}