class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.isEmpty() || s.length() < k)
            return false;
        if(s.length() == k)
            return true;
        int[] freq = new int[26];
        for(Character ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(freq[i] % 2 == 1)
                count++;
        }
        return count <= k;
    }
}