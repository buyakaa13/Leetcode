class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(i == j) continue;
                if(nums[i] > nums[j])
                    count++;
            }
            array[i] = count;
        }
        return array;
    }
}