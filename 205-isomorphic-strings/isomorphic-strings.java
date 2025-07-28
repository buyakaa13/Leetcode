class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int idx1=0, idx2 = 0;
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1, i+1));
            str1.append(map1.get(ch1));
            char ch2 = t.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2, i+1));
            str2.append(map2.get(ch2));
        }
        return str1.toString().equals(str2.toString());
    }
}