class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for(int i=0; i<nums.length; i++){
            int diff = Math.abs(0 - nums[i]);
            if(Math.abs(nums[i]) < Math.abs(closest) || (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest)){
                closest = nums[i];
            }
        }
        return closest;
    }
}