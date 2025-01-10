class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        if(words1.length == 0 || words2.length == 0)
            return list;
        int[] maxFreq = new int[26];
        for(String word: words2){
            int[] freq = getFrequency(word);
            for(int i=0; i<26; i++){
                maxFreq[i] = Math.max(freq[i], maxFreq[i]);
            }
        }

        for(String word: words1){
            int[] freq = getFrequency(word);
            boolean exists = true;
            for(int i=0; i<26; i++){
                if(freq[i] < maxFreq[i]){
                    exists = false;
                    break;
                }
            }
            if(exists) list.add(word);
        }
        return list;
    }

    public int[] getFrequency(String word){
        int[] freq = new int[26];
        for(Character c: word.toCharArray())
            freq[c - 'a']++;
        return freq;
    }
}