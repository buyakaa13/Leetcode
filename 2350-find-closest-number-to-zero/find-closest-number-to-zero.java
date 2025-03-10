class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        int mainDiff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int diff = Math.abs(0 - nums[i]);
            if(diff < mainDiff){
                mainDiff = diff;
                closest = nums[i];
            }
            else if(diff == mainDiff)
                closest = Math.max(nums[i], closest);
        }
        return closest;
    }
}