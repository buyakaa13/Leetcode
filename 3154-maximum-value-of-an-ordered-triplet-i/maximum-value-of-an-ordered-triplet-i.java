class Solution {
    public long maximumTripletValue(int[] nums) {
        if(nums.length < 3) return 0;
        long sum = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    long s = (long)(nums[i]-nums[j])*nums[k];
                    if(s > sum) sum = s;
                }
            }
        }
        return sum;  
    }
}