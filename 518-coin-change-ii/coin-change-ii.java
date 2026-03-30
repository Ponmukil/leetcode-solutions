class Solution {
    public int noChange(int[] coins, int i, int amount, int[][] dp){
       
        if(amount == 0) return 1;
        if(amount < 0 || i < 0) return 0;
        if(dp[i][amount] != -1) return dp[i][amount];
        int not_take = noChange(coins, i-1, amount, dp);
        int take = noChange(coins, i, amount-coins[i], dp);
        return dp[i][amount] = not_take + take;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
         int[][] dp = new int[n][amount+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= amount; j++){
                dp[i][j] = -1;
            }
        }
        return noChange(coins, n-1, amount, dp);
    }
}