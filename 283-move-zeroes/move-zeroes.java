class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroElement=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0)
            {
                nums[nonZeroElement] = nums[i];
                nonZeroElement++;
            }
        }

        while(nonZeroElement<nums.length){
            nums[nonZeroElement] =0;
            nonZeroElement++;
        }
    }
}