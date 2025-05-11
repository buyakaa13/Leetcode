class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, list, result);
        return result;
    }

    public void backtrack(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> result){
        if(nums.length == list.size()) { 
            result.add(new ArrayList<>(list)); 
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i] = true;
                backtrack(nums, used, list, result);
                list.remove(list.size()-1);
                used[i] = false;
            }
                
        }
    }

    // public void backtrack(int[] nums, boolean[] pick, List<Integer> perm, List<List<Integer>> res) {
    //     if (perm.size() == nums.length) {
    //         res.add(new ArrayList<>(perm));
    //         return;
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         if (!pick[i]) {
    //             perm.add(nums[i]);
    //             pick[i] = true;
    //             backtrack(nums, pick, perm, res);
    //             perm.remove(perm.size() - 1);
    //             pick[i] = false;
    //         }
    //     }
    // }
}