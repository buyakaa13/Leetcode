class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{leftSearch(nums, target), rightSearch(nums, target)};
    }

    public int leftSearch(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int index = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= target)
                high = mid-1;
            else
                low = mid+1;
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    public int rightSearch(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int index = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= target)
                low = mid+1;
            else
                high = mid - 1;
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
}