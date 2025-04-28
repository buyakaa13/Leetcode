class Solution {
    public long countSubarrays(int[] nums, long k) {
        long result = 0, total = 0;
        for(int i=0, j=0; j<nums.length; j++){
            total += nums[j];
            while(i<=j && total*(j-i+1) >= k){
                total -= nums[i];
                i++;
            }
            result += j-i+1;
        }
        return result;
    }
}