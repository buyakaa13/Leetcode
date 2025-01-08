class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        if(words.length == 0)
            return 0;
        int count = 0;
        for (int i=0; i<words.length - 1; i++){
            for (int j=i+1; j<words.length; j++){
                count = isPrefixAndSuffix(words[i], words[j]) ? count+1 : count;
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str2.contains(str1)){
            int len1 = str1.length();
            int len2 = str2.length();
            if(str2.substring(0, len1).equals(str1) && str2.substring(len2 - len1, len2).equals(str1))
                return true;
        }
        return false;
    }
}