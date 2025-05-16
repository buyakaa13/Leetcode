class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n; i++){
            if(i == 0 || groups[i] != groups[i-1])
                list.add(words[i]);
        }
        return list;
    }
}