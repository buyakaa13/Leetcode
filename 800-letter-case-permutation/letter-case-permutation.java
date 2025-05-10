class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    public void backtrack(char[] s, int start, List<String> result){
        if(s.length == start) result.add(new String(s));
        else{
            if(Character.isLetter(s[start])){
                s[start] = Character.toUpperCase(s[start]);
                backtrack(s, start+1, result);
                s[start] = Character.toLowerCase(s[start]);
                backtrack(s, start+1, result);
            }
            else
                backtrack(s, start+1, result);
        }
    }
}