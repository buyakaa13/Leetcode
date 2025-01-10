class Solution {
    public int characterReplacement(String s, int k) {
        if(s.isEmpty() || s.equals(""))
            return 0;
        int[] count = new int[26];
        int left = 0, maxFreq = 0, result = 0;
        for(int r=0; r<s.length(); r++){
            count[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(r) - 'A']);
            while((r-left+1) - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result, r-left+1);
        }
        return result;
    }
}