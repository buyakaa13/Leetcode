class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            int prod = 1;
            int gcdVal = nums[start];
            int lcmVal = nums[start];

            for (int end = start; end < n; end++) {
                prod *= nums[end];
                gcdVal = gcd(gcdVal, nums[end]);
                lcmVal = lcm(lcmVal, nums[end]);

                if (prod == lcmVal * gcdVal) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }
}