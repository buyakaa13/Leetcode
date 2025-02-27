class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private int sumOfSquares(int num){
        int sum = 0;
        while(num > 0){
            int digit = num%10;
            sum += digit*digit;
            num /= 10;
        }
        return sum;
    }
}