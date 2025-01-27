class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums.length == 0 || k < 0)
            return 0;
        int count = 0;
        for(int num: nums)
            if(num == k) count++;
        int subCount = 0;

        for(int i=1; i<=50; i++){
            if (i == k) continue;
            int maxCurrent = 0;
            int current = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == i)
                    current++;
                else if(nums[j]==k) current--;
               if(current < 0) current = 0;
                maxCurrent = Math.max(maxCurrent, current);
            }
            subCount = Math.max(subCount, maxCurrent);
        }
        return count + subCount;
    }
}