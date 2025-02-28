class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] array = new int[len];
        int left = 0, right=len-1, index=0;
        while(index!=len){
            array[index++] = nums[left++];
            if(left <= right){
                array[index++] = nums[right--];
            }
        }
        return array;
    }
}