class Solution {
    public int maximumStrongPairXor(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]))
                    max = Math.max(nums[i]^nums[j], max);
            }
        }
        return max;
    }
}