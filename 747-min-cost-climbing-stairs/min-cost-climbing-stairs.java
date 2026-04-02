class Solution {
    public int minCost(int[] cost, int i, int[] dp){

        if(i < 0) return 0;
        if(dp[i] != -1) return dp[i];
        int one = cost[i] + minCost(cost, i-1, dp);
        int two = cost[i] + minCost(cost, i-2, dp);
        return dp[i] = Integer.min(one, two);

    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Integer.min(minCost(cost, n-1, dp), minCost(cost, n-2, dp));
    }
}