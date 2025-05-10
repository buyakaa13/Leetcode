class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, 0, result);
        return result;
    }

    public void backtrack(int[] nums, boolean[] used, int start, List<List<Integer>> result){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(used[i])
                list.add(nums[i]);
        }

        result.add(list);

        for(int i=start; i<nums.length; i++){
            if(!used[i]){
                used[i] = true;
                backtrack(nums, used, i+1, result);
                used[i] = false;
            }
        }
    }
}