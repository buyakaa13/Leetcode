class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i=0; i<nums.length; i++)
            max = Math.max(nums[i], max);

        int low = 1, smallest = Integer.MAX_VALUE;
        while(low <= max){
            int mid = low + (max-low)/2;
            int sum = 0;
            for(int i=0; i<nums.length; i++){
                int ceil1 = (nums[i]+mid-1)/mid;
                sum += ceil1;
            }
            if(sum <= threshold){
                max = mid-1;
                smallest = Math.min(mid, smallest);
            }
            else
                low = mid+1;
        }
        return low;
    }
}