class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        if(nums.length == 0)
            return result;
        int start = nums[0], end = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] != end+1 && start == end){
                result.add(String.valueOf(start));
                start = nums[i];
            }
            else if(nums[i] != end+1){
                result.add(String.valueOf(start)+"->"+String.valueOf(end));
                start = nums[i];
            }
            end = nums[i];
            System.out.println("start: " + start + " end: " + end);
        }

        if(start == end)
            result.add(String.valueOf(start));
        else
            result.add(String.valueOf(start)+"->"+String.valueOf(end));
        return result;
    }
}