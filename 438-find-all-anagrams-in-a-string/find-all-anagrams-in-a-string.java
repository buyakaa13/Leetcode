class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() == 0 || p.length() == 0)
            return new ArrayList<>();
        int len = p.length();
        int[] subset = getFrequence(p);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=s.length()-len; i++){
            String sub = s.substring(i, i+len);
            int[] set = getFrequence(sub);
            if(Arrays.equals(subset, set))
                list.add(i);
        }
        return list;
    }

     public int[] getFrequence(String str){
        int[] freq = new int[26];
        for(Character ch: str.toCharArray())
            freq[ch - 'a']++;
        return freq;
    }
}