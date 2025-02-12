class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> hash = new HashMap<>();
        for(int num: nums){
            String numberString = String.valueOf(num);
            int key = 0;
            for (char c : numberString.toCharArray())
                key += Integer.parseInt(String.valueOf(c));
            List<Integer> list = hash.getOrDefault(key, new ArrayList<>());
            list.add(num);
            hash.put(key, list);
        }
        int max = -1;
        for(Map.Entry<Integer, List<Integer>> entry: hash.entrySet()){
            List<Integer> list  = entry.getValue();
            Collections.sort(list);
            int size = list.size();
            if(size >= 2) {
                int sum = list.get(size - 1) + list.get(size - 2);
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}