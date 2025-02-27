class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int MOD = 1000000007;
        int[] power = new int[nums.length];
        power[0] = 1;

        for(int i=1; i<nums.length; i++)
            power[i] = (power[i-1]*2)%MOD;

        int left = 0, right = nums.length-1, count = 0;
        while(left<=right){
            if(nums[left] + nums[right] <= target){
                count = (count + power[right-left]) % MOD;
                left++;
            }
            else
                right--;
        }
        return count;
    }
}