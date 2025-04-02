class Solution {
    public long maximumTripletValue(int[] nums) {
        if(nums.length < 3) return 0;
        long result = 0, imax = 0, dmax =0;
        for(int i=0; i<nums.length; i++){
            result = Math.max(dmax*nums[i], result);
            dmax = Math.max(imax - nums[i], dmax);
            imax = Math.max(nums[i], imax);
        }
        return result;  
    }
}