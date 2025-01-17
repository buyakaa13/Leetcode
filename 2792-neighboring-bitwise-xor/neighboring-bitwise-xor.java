class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        if(derived.length == 0)
            return false;
        int sum = 0;
        for(int i=0; i<derived.length; i++)
            sum ^= derived[i];
        return sum == 0;
    }
}