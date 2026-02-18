class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String newS = new String(array);
            if(!result.containsKey(newS))
                result.put(newS, new ArrayList());
            result.get(newS).add(s);
        }
        return new ArrayList<>(result.values());
    }
}