class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return 0;

        int xor1 = 0;
        if (nums2.length % 2 == 1) {
            for (int num : nums1) {
                xor1 ^= num;
            }
        }

        int xor2 = 0;
        if (nums1.length % 2 == 1) {
            for (int num : nums2) {
                xor2 ^= num;
            }
        }

        return xor1 ^ xor2;
    }
}