class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length < 3) return 0;
        int result = 0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i]> arr[i+1]){
                int left = i, right = i;
                while(left > 0 && arr[left]>arr[left-1])
                    left--;
                while(right<arr.length-1 && arr[right] > arr[right+1])
                    right++;
                result = Math.max(right-left+1, result);
            }
        }
        return result;
    }
}