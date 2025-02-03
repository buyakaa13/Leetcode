class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 0) return 0;
        int increase = 1;
        int decrease = 1;
        int count = 1;
        for(int i=0; i<nums.length-1; i++){
            increase = nums[i] < nums[i+1] ? increase+1 : 1;
            decrease = nums[i] > nums[i+1] ? decrease+1 : 1;
            count = Math.max(decrease > increase ? decrease : increase, count);
        }
        return count;
    }
}