class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
        for(int i=0; i<quantities.length; i++)
            max = Math.max(quantities[i], max);
        
        int low = 1;
        while(low <= max){
            int mid = low + (max-low)/2;
            int count = 0;
            for(int i=0; i<quantities.length; i++){
                int c = (quantities[i]+mid-1)/mid;
                count += c;
            }
            if(count <= n)
                max = mid - 1;
            else 
                low = mid + 1; 
        }
        return low;
    }
}