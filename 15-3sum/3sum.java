class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3)
            return list;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] + nums[i] < 0)
                    left++;
                else if(nums[left] + nums[right] + nums[i] > 0)
                    right--;
                else{
                    List<Integer> numbers = new ArrayList<>();
                    numbers.add(nums[i]);
                    numbers.add(nums[left]);
                    numbers.add(nums[right]);
                    set.add(numbers);
                    left++;
                    right--;
                }
            }
        }
        
        for(List<Integer> s: set)
            list.add(s);
        return list;
    }
}