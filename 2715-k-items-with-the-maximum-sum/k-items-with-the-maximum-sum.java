class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes) return k;
        else if(k <= numZeros+numOnes) return numOnes;
        else if(k <= numZeros+numOnes + numNegOnes) {
            int l = k - numOnes-numZeros;
            return numOnes - l;
        } 
        else return -1;
    }
}