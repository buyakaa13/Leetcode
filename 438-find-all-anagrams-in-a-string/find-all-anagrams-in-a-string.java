class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length())
            return new ArrayList<>();
        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            pCount.put(p.charAt(i), pCount.getOrDefault(p.charAt(i), 0) + 1);
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Integer> res = sCount.equals(pCount) ? new ArrayList<>(Arrays.asList(0)) : new ArrayList<>();
        int l = 0;
        for (int r = p.length(); r < s.length(); r++) {
            sCount.put(s.charAt(r), sCount.getOrDefault(s.charAt(r), 0) + 1);
            sCount.put(s.charAt(l), sCount.getOrDefault(s.charAt(l), 0) - 1);

            if (sCount.get(s.charAt(l)) == 0)
                sCount.remove(s.charAt(l));
            l++;
            if (sCount.equals(pCount))
                res.add(l);
        }
        return res;
    }
}