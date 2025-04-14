class Solution {
    public int unequalTriplets(int[] nums) {
        int len = nums.length, count = 0;
        for(int i=0; i<len-2; i++){
            for(int j=i; j<len-1; j++){
                if(nums[i] != nums[j]){
                    for(int k=j; k<len; k++){
                        if(nums[i] != nums[k] && nums[j] != nums[k])
                            count++;
                    }
                }
            }
        }
        return count;
    }
}