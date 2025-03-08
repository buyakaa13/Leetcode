class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0, tCount=0;    
        for(int n : nums){
            if(n<target)
                count++;
            else if(n==target)
                tCount++;
        }
        List<Integer> ans = new ArrayList<>();
            for(int t=0;t<tCount;t++)
                ans.add(count++);
        return ans;
    }
}