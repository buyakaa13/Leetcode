class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.isEmpty() || s2.isEmpty())
            return false;
        if(s1.length() > s2.length()) return false;
        int str1Len = s1.length(), str2Len = s2.length();
        int[] str1Freq = new int[26];
        int[] str2Freq = new int[26];
        for(int i=0; i<str1Len; i++){
            str1Freq[s1.charAt(i) - 'a']++;
            str2Freq[s2.charAt(i) - 'a']++;
        }
        for(int i=str1Len; i<str2Len; i++){
            if(Arrays.equals(str1Freq, str2Freq))
                return true;
            str2Freq[s2.charAt(i-str1Len) - 'a']--;
            str2Freq[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(str1Freq, str2Freq)) return true;
        else
            return false;
    }
}