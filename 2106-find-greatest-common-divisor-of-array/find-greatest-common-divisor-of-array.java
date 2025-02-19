class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int i=1; i<nums.length; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        return gcd(min, max);
    }

    public int gcd(int min, int max){
        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}