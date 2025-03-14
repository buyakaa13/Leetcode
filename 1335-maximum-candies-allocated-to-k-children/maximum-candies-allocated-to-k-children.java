class Solution {
    public int maximumCandies(int[] candies, long k) {
        long max = 10000007;
        // for(int i=0; i<candies.length; i++)
        //     max = Math.max(candies[i], max);
        long low = 1, sumCount = 0;
        while(low <= max){
            long mid = low + (max-low)/2;
            long count = 0;
            for(int i=0; i<candies.length; i++){
                long t = candies[i] / mid;
                count+=t;
            }

            if(count >= k){
                low = mid+1;
                sumCount = Math.max(mid, sumCount);
            }
            else
                max = mid-1;
        }
        return (int)sumCount;
    }
}