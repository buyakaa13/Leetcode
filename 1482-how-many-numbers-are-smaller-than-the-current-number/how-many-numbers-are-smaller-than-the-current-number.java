class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copyArray = nums.clone();
        Arrays.sort(copyArray);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<copyArray.length; i++){
            map.putIfAbsent(copyArray[i], i);
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}