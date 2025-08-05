class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String str = strs[0];
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            Character currentChar = str.charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || currentChar != strs[j].charAt(i))
                    return result.toString();
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}