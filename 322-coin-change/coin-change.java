class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] array = new int[amount+1];
        Arrays.fill(array, amount+1);
        array[0] = 0;
        for(int j=1; j<amount+1; j++){
            for(int coin: coins){
               if(j-coin >= 0)
                   array[j] = Math.min(array[j-coin] + 1, array[j]);
           }
       }
        return array[amount] != amount+1 ? array[amount] : -1;
    }
}