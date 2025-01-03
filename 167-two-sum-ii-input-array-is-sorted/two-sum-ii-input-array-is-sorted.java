class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers.length < 2)
            return result;
        int len = numbers.length;
        int left = 0;
        while(left < len){
            int right = left + 1;
            while(right < len){
                if(numbers[left] + numbers[right] == target){
                    result[0] = left+1;
                    result[1] = right+1;
                    return result;
                }
                right++;
            }
            left++;
        }
        return result;
    }
}