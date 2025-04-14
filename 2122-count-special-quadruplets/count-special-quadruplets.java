class Solution {
    public int countQuadruplets(int[] nums) {
        int len = nums.length, count = 0; 
        for(int a=0; a<=len-4; a++){
            for(int b=a+1; b<=len-3; b++){
                for(int c=b+1; c<=len-2; c++){
                    for(int d=c; d<=len-1; d++){
                        if(nums[a] + nums[b] + nums[c] == nums[d])
                            count++;
                    }
                }
            }
        }
        return count;
    }
}