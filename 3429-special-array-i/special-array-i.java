class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 0) return false;
        else if(nums.length == 1) return true;

        for(int i=0; i<nums.length-1; i++){
            boolean first = true;
            boolean second = true;
            if(nums[i] % 2 != 0) first = false;
            if(nums[i + 1] % 2 != 0) second = false;

            if(first == second)
                return false;
        }
        return true;
    }
}