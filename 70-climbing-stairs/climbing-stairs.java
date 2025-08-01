class Solution {
    public int climbStairs(int n) {
        if (n == 1) return n;
        int first = 0, second = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}