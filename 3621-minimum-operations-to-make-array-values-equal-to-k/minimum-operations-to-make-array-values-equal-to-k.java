class Solution {
    public int minOperations(int[] nums, int k) {
        if(nums.length == 1 && nums[0] == k)
            return 0;
        TreeSet<Integer> map = new TreeSet<>();
        int count = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] < k)
                return -1;
            else if(!map.contains(nums[i])){
                map.add(nums[i]);
                if(nums[i] > k)
                    count++;
            }
        }
        return map.size() > 0 ? count : -1;
    }
}