class Solution {
    public int maxSubArray(int[] nums) {
        int r = 0;
        int max = Integer.MIN_VALUE, sum = 0;
        while(r < nums.length){
            sum += nums[r];
            max = Integer.max(max, sum);
            if(sum < 0) sum = 0;
            r++;
        }
        return max;
    }
}