class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3)
            return -1;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left = i + 1, right = nums.length - 1;
            while(left<right){
                int sum = nums[left] + nums[right] + nums[i];
                if(Math.abs(sum-target) < Math.abs(closestSum-target))
                    closestSum = sum;
                if(sum > target)
                    right--;
                else if(sum < target)
                    left++;
                else
                    return sum;
            }
        }
        return closestSum;
    }
}