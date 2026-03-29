class Solution {
    public int minCoins(int[] coins, int i, int amount, int[][] dp){
        if(i == 0){
            if(amount % coins[i] == 0) return amount / coins[i];
            else return 99999;
        }
        if(dp[i][amount] != -1) return dp[i][amount];
        int not_take = minCoins(coins, i-1, amount, dp);
        int take = Integer.MAX_VALUE;
        if(coins[i] <= amount) take = 1 + minCoins(coins, i, amount - coins[i], dp);
        return dp[i][amount] = Integer.min(take, not_take);
    }   
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= amount; j++){
                dp[i][j] = -1;
            }
        }
        int ans =  minCoins(coins, n-1, amount, dp);
        if(ans == 99999) return -1;
        else return ans;
    }
}