class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, r = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[r] = nums[i];
                r += 2;
            }
            else{
                ans[l] = nums[i];
                l += 2;
            }
        }
        return ans;
    }
}