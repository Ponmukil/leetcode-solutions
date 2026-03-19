class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0; 
        int n = nums.length;
        int min = Integer.MAX_VALUE, sum = 0;
        while(r < n){
            sum += nums[r];
            while(sum >= target){
                min = Integer.min(min, r - l + 1);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}