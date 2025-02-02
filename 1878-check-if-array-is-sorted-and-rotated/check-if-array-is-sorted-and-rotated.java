class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        if(len == 0) return false;
        int count = 1;
        for(int i=0; i<len-1; i++){
            if(nums[i] > nums[i+1])
                count--;
            if(count < 0)
                return false;
            else if (count == 0 && nums[0] < nums[len-1])
                return false;
        }
        return true;
    }
}