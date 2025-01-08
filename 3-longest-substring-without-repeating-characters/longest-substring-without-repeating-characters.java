class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty() || s.equals(""))
            return 0;
        else if(s.length() == 1)
            return 1;
        int count = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                count = Math.max(set.size(), count);
            }
            else {
                set.remove(s.charAt(left++));
            }
        }
        return count;
    }
}