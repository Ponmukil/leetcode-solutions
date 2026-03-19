class Solution {
    public int maxProduct(int[] nums) {
        int lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE;
        int l = 1, r = 1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            l = l * nums[i];
            r = r * nums[n-i-1];
            lmax = Integer.max(lmax, l);
            rmax = Integer.max(rmax, r);
            if(l == 0) l = 1;
            if(r == 0) r  =1;

        }
        return Integer.max(lmax, rmax);
    }
}