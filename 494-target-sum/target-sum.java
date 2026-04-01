class Solution {
    public void find(int[] nums, int i, int target, int sum, int[] ans){
        if(i >= nums.length){
            if(sum == target){
                ans[0] += 1;
            }
            return;
        }
        find(nums, i+1, target, sum+nums[i], ans);
        find(nums, i+1, target, sum+(nums[i]*-1), ans);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int[] ans = new int[1];
        find(nums, 0, target, 0, ans);
        return ans[0];
    }
}