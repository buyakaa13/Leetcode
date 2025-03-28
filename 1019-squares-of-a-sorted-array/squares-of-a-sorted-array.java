class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length-1;
        int[] result = new int[len+1];
        int l=0, r=len, pos = len;
        while(l<=r){
            int left = Math.abs(nums[l]);
            int right = Math.abs(nums[r]);
            if(left>right){
                result[pos] = left*left;
                l++;
            }
            else{
                result[pos] = right*right;
                r--;
            }
            pos--;
        }
        return result;
    }
}