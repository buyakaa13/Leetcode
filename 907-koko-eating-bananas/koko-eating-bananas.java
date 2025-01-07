class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length == 0)
            return 0;
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        while(low<high){
            int mid = (low + high)/2;
            int sum = 0;
            for(int pile: piles)
                sum += (pile + mid - 1) / mid;
            if(sum <= h)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}