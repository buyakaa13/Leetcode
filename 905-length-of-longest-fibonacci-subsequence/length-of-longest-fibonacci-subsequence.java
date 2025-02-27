class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if(arr.length <= 2)
            return arr.length;
        Set<Integer> set = new HashSet();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int prev = arr[j];
                int current = arr[j] + arr[i];
                int len = 2;
                while(set.contains(current)){
                    int temp = current;
                    current += prev;
                    prev = temp;
                    count = Math.max(count, ++len);
                }
            }
        }
        return count;
    }
}