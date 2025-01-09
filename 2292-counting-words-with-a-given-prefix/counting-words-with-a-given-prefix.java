class Solution {
    public int prefixCount(String[] words, String pref) {
        if(words.length == 0)
            return 0;
        int count = 0;
        for(String str: words){
            if(str.startsWith(pref))
                count++;
        }
        return count;
    }
}