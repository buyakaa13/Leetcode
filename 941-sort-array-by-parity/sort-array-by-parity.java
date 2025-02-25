class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int indexOdd = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                int temp = nums[indexOdd];
                nums[indexOdd] = nums[i];
                nums[i] = temp;
                indexOdd++;
            }
        }
        return nums;
    }
}