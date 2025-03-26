class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        boolean increase = nums[0] - nums[len-1] < 0 ? true : false;
        for(int i=1; i<nums.length; i++){
            if(increase && nums[i-1] - nums[i] > 0)
                return false;
            if(!increase && nums[i-1] - nums[i] < 0)
                return false;
        }
        return true;
    }
}