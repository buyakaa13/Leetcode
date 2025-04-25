class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[26];
        for(int i=0; i<order.length(); i++){
            dic[order.charAt(i) - 'a'] = i;
        }

        for(int i=0; i<words.length-1; i++){
            String word1 = words[i], word2 = words[i+1];
            for(int j=0; j<word1.length(); j++){
                if(word2.length() == j) return false;
                if(word1.charAt(j) != word2.charAt(j)){
                    if(dic[word1.charAt(j)-'a'] > dic[word2.charAt(j)-'a']) return false;
                    break;
                }
            }
        }
        return true;
    }
}