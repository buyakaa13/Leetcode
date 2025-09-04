class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-x) == Math.abs(y-z)) return 0;
        return Math.abs(z-x) < Math.abs(y-z) ? 1 : 2;
    }
}