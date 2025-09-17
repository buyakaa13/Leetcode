class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);        

        int count = 0;
        boolean isOdd = false;
        for(int val: map.values()){
            if(val%2 == 0)
                count+=val;
            else
            {
                count+=val-1;
                isOdd = true;
            }
        }
        return isOdd ? count+1 : count;
    }
}