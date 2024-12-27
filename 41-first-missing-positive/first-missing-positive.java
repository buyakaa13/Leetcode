class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for(int i=0; i<nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        int last = map.lastKey();
        for(int i=1; i<=last; i++){
            if(!map.containsKey(i))
                return i;
        }
        return last > 0 ? last+1 : 1;
    }
}