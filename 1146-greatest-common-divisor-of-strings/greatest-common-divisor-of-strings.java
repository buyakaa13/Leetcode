class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String max = str1.length() >= str2.length() ? str1 : str2;
        String min = str1.length() < str2.length() ? str1 : str2;
        if(!max.startsWith(min))
            return "";
        while(!min.isEmpty()){
            if(max.startsWith(min)){
                String temp = min;
                min = max.replace(min, "");
                max = temp;
            }
            else
                return "";
        }
        return max;
    }
}