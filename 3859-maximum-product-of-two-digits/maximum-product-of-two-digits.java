class Solution {
    public int maxProduct(int n) {
        if(n < 10) return n;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n%10);
            n = n / 10;
        }

        int max = 0;
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                max = Math.max(list.get(i)*list.get(j), max);
            }
        }
        return max;
    }
}