class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
            minDiff = Math.min(Math.abs(arr[i]-arr[i+1]), minDiff);
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            List<Integer> list = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1]) == minDiff){
                list.add(arr[i]);
                list.add(arr[i+1]);
            }
            if(list.size()>0)
                result.add(list);
        }
        return result;
    }
}