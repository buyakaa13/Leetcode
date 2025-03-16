class Solution {
    public long repairCars(int[] ranks, int cars) {
        long max = 1L*ranks[0]*cars*cars, low = 1;
        while(low < max){
            long mid = low + (max-low)/2;
            long carsRepaired = 0;
            for(int i=0; i<ranks.length; i++)
                carsRepaired += (long)Math.sqrt((1.0*mid)/ranks[i]);
            if(carsRepaired < cars)
                low = mid+1;
            else
                max = mid;
        }
        return low;
    }
}