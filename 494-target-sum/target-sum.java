class Solution {
    public int find(int[] nums, int i, int target){ 
        if(i >= nums.length){
            if(target == 0){
                return 1;
            }
            return 0;
        }
        int plus = find(nums, i+1, target-nums[i]);
        int minus = find(nums, i+1, target-(nums[i]*-1));
        return plus +  minus;

    }
    public int findTargetSumWays(int[] nums, int target) {
        int[] ans = new int[1];
        return find(nums, 0, target);
        
    }
}