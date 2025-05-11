class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, list, used, result);
        return new ArrayList(result);
    }

    public void backtrack(int[] nums, List<Integer> list, boolean[] used, HashSet<List<Integer>> result){
        if(nums.length == list.size()){
            result.add(new ArrayList(list));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!used[i]){
                used[i] = true;
                list.add(nums[i]);
                backtrack(nums, list, used, result);
                used[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}