class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        int vowel = 0, cons = 0;
        for(Map.Entry<Character, Integer> m: map.entrySet()){
            if(m.getKey() == 'a' || m.getKey() == 'e' || m.getKey() == 'i' || m.getKey() == 'o' || m.getKey() == 'u')
                vowel = Math.max(vowel, m.getValue());
            else
                cons = Math.max(cons, m.getValue());
        }
        return vowel + cons;
    }
}