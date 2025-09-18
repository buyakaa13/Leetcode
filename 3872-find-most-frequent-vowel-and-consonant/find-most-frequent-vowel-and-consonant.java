class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int vowel = 0, cons = 0;
        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i) - 'a';
            freq[num]++;
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                vowel = Math.max(vowel, freq[num]);
            else
                cons = Math.max(cons, freq[num]);
        }
        return vowel + cons;
    }
}