class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++){
            char[] strArray = array[i].toCharArray();
            int left=0, right=strArray.length-1;
            while(left<=right){
                char temp = strArray[left];
                strArray[left] = strArray[right];
                strArray[right] = temp;
                left++;
                right--;
            }
            sb.append(strArray).append(" ");
        }
        
        return sb.toString().trim();
    }
}