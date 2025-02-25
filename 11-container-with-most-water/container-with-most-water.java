class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2)
            return 0;
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            max = Math.max((right-left)*Math.min(height[left], height[right]), max);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}