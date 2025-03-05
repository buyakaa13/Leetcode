class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n <= 0)
        //     return false;
        // while(n>1){
        //     if(n%3 == 2 || n%3 ==1)
        //         return false;
        //     n /= 3;
        // }
        
        // return true;

        long temp=1;
        int i=1;
        while(n>1 && temp<n)
            temp+=temp<<1;
        return temp==n;
    }
}