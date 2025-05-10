class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, 0, result);
        return new ArrayList(result);
    }

    public void backtrack(int[] nums, boolean[] used, int start, HashSet<List<Integer>> result){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(used[i])
                list.add(nums[i]);
        }
        Collections.sort(list);
        result.add(list);

        for(int i=start; i<nums.length; i++){
            if(!used[i]){
                used[i] = true;
                backtrack(nums, used, start+1, result);
                used[i] = false;
            }
        }
    }
}