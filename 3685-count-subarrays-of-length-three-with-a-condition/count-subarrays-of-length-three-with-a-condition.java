class Solution {
    public int countSubarrays(int[] nums) {
        if(nums.length < 3) return 0;
        int count = 0;
        for(int i=0; i<nums.length-2; i++){
            if((nums[i]+nums[i+2])*2 == nums[i+1])
                count++;
        }
        return count;
    }
}