class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i])){
                result = words[i];
                break;
            }
        }
        return result;
    }

    private boolean isPalindrome(String str){
        int left = 0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
}