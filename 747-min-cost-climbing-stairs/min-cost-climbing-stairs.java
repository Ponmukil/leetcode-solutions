class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int n1 = cost[0];
        int n2 = cost[1];
        int num = 0;
        for(int i = 2; i < n; i++){
            num = Math.min(n1, n2) + cost[i];
            n1 = n2;
            n2 = num;
        }
        return Math.min(n1, n2);
    }
}