class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n == 0) return 0;
        if(n <= 2) return 1;
        if(map.containsKey(n)) return map.get(n);
        int sum = fib(n-1)+fib(n-2);
        map.put(n, sum);
        return sum;
    }
}