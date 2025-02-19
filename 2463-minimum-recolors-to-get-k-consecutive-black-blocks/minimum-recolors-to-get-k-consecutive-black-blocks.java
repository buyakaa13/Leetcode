class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        char[] array = blocks.toCharArray();
        while(right < array.length){
            if(right >= k)
            {
                if(array[left] == 'W')
                    count--;
                left++;
            }
            if(array[right] == 'W')
                count++;
            right++;
            if(right >= k)
                min = Math.min(count, min);
        }
        return min;
    }
}