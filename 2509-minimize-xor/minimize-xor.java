class Solution {
    public int minimizeXor(int num1, int num2) {
        if(num1 <= 0 || num2 <= 0)
            return 0;
        int result = 0;
        int count = Integer.bitCount(num2);
        for (int i = 31; i >= 0 && count > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                count--;
                result += (1 << i);
            }
        }
        for (int i = 0; i < 32 && count > 0; i++) {
            if ((num1 & (1 << i)) == 0) {
                count--;
                result += (1 << i);
            }
        }
        return result;
    }
}