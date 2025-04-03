class Solution {
    public long maximumTripletValue(int[] nums) {
        long subMax = 0, multiMax = 0, result = 0;
        for(int i=0; i<nums.length; i++){
            result = Math.max(result, multiMax*nums[i]);
            multiMax = Math.max(multiMax, subMax-nums[i]);
            subMax = Math.max(subMax, nums[i]);
        } 
        return result;
    }
}