class Solution {
    public int minimumLength(String s) {
        if(s.isEmpty())
            return 0;
        int[] freq = new int[26];
        for(Character c: s.toCharArray())
            freq[c - 'a']++;

        int count = 0;
        for(int i=0; i<26; i++){
            if(freq[i] > 0 && freq[i] % 2 == 0){
                count+=2;
            }
            else if(freq[i] > 0 && freq[i] % 2 == 1)
                count++;
        }
        return count;
    }
}