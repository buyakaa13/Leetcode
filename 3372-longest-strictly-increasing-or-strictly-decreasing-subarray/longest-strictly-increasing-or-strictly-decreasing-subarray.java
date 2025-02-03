class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 0) return 0;
        int increase = 1;
        int decrease = 1;
        int count = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1])
                increase++;
            else
                increase = 1;

            if(nums[i] > nums[i+1])
                decrease++;
            else
                decrease = 1;
            count = Math.max(Math.max(decrease, increase), count);
        }
        return count;
    }
}