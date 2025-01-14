class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        if(A.length == 0 || B.length == 0 || A.length != B.length)
            return null;
        int[] result = new int[A.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<A.length; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            if(map.containsValue(2)) {
                int count = 0;
                for(Map.Entry<Integer, Integer> entry: map.entrySet())
                   if(entry.getValue() > 1)
                       count++;
                result[i] = count;
            }
        }
        return result;
    }
}