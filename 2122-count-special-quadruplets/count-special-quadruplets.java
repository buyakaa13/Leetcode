class Solution {
    public int countQuadruplets(int[] nums) {
        int len = nums.length, count = 0; 
        for(int a=0; a<len-3; a++){
            for(int b=a+1; b<len-2; b++){
                for(int c=b+1; c<len-1; c++){
                    for(int d=c; d<len; d++){
                        if(nums[a] + nums[b] + nums[c] == nums[d])
                            count++;
                    }
                }
            }
        }
        return count;
    }
}