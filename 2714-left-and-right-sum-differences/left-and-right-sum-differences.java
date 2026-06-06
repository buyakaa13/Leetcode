class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftArray = new int[len];
        int[] rightArray = new int[len];

        for(int i=1; i<len; i++){
            leftArray[i] = leftArray[i-1]+nums[i-1];
            rightArray[len-i-1] = rightArray[len-i]+nums[len-i];
        }


        int[] result = new int[len];
        for(int i=0; i<len; i++)
            result[i] = Math.abs(leftArray[i] - rightArray[i]);

        return result;

    }
}