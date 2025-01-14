class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length == 0)
            return null;
        int[] array = Arrays.copyOf(nums, nums.length*2);
        for(int i=0; i<nums.length; i++)
            array[nums.length + i] = nums[i];
        return array;
    }
}