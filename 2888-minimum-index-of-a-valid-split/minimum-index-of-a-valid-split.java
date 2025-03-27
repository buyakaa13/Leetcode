class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> secondMap = new HashMap<>();
        int len = nums.size();
        for(int i=0; i<len; i++)
            secondMap.put(nums.get(i), secondMap.getOrDefault(nums.get(i), 0)+1);
        
        for(int i=0; i<len; i++){
            int index = nums.get(i);
            secondMap.put(index, secondMap.get(index)-1);
            firstMap.put(index, firstMap.getOrDefault(index, 0)+1);
            if(firstMap.get(index)*2 > i+1 && secondMap.get(index)*2 > len-i-1)
                return i;
        }
        return -1;
    }
}