class Solution {
    public boolean checkString(String s) {
        if(s.isEmpty()) return false;
        char[] array = s.toCharArray();
        for(int i=0; i<array.length-1; i++){
            if(array[i] != 'a' && array[i] != 'b')
                return false;
            if(array[i] == 'b' && array[i+1] == 'a')
                return false;
        }
        return true;
    }
}