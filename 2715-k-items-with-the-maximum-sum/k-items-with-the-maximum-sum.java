class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes) return k;
        else if(k <= numZeros+numOnes) return numOnes;
        else if(k <= numZeros+numOnes + numNegOnes) 
            return numOnes - (k - numOnes-numZeros);
        else return -1;
    }
}