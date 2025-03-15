class Solution {
    public int minCapability(int[] nums, int k) {
        int max = 0;
        for(int i=0; i<nums.length; i++)
            max = Math.max(nums[i], max);
        int low = 1;
        while(low<=max){
            int need = 0;
            int mid = low + (max-low)/2;
            int current = -1;
            for(int i=0; i<nums.length; i++){
                if(current==-1&&nums[i] <= mid)
                    {
                        current=i;
                        need++;
                    }
                if(i-current > 1 && nums[i] <= mid){
                    need++;
                    current =i; 
                }
            }
            if(need >= k)
                max = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}