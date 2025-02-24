class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int len = word1.length() + word2.length();
        int left = 0, right = 0;
        for(int i=0; i<len-1; i++){
            if(left < word1.length()){
                str.append(word1.charAt(left));
                left++;
            }
            if(right < word2.length()){
                str.append(word2.charAt(right));
                right++;
            }
        }
        return str.toString();
    }
}