class Solution {
    public int hammingWeight(int n) {
        int bit = 0;
        for(int i=0; i<32; i++){
            int cbit = (n>>i)&1;
            if(cbit==1) bit++;
        }
        return bit;
    }
}