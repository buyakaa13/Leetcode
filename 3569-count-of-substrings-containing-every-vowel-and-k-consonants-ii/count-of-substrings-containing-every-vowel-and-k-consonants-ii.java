class Solution {
    public long countOfSubstrings(String word, int k) {
        return atLeastK(word, k) - atLeastK(word, k+1);
    }

    private long atLeastK(String word, int k){
        long numValidSubstrings = 0;
        int start = 0, end = 0;
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        int consonantCount = 0;
        while(end < word.length()){
            char letter = word.charAt(end);
            if(isVowel(letter))
                vowelCount.put(letter, vowelCount.getOrDefault(letter, 0) + 1);
            else
                consonantCount++;

            while(vowelCount.size() == 5 && consonantCount >= k){
                numValidSubstrings += word.length() - end;
                char startLetter = word.charAt(start);
                if(isVowel(startLetter)){
                    vowelCount.put(startLetter, vowelCount.get(startLetter)-1);
                    if(vowelCount.get(startLetter) == 0)
                        vowelCount.remove(startLetter);
                }
                else consonantCount--;
                start++;
            }
            end++;
        }
        return numValidSubstrings;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}