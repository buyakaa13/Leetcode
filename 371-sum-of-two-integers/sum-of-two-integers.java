class Solution {
    public int getSum(int a, int b) {
        int carry=0;

        // 01 xor 10 = 11 //1^1 = 0 ; 1&1
        // 1&1 
        while(b!=0){
            carry = (a&b);
            a =(a^b);
            b=(carry<<1);
        }
        return a;
    }
}