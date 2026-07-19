class Solution {
    public boolean canFormPairs(int[] nums, int p, int maxDiff){
        int n = nums.length;
        int count = 0;
        int i = 0;
        while(i < n-1){
            if(nums[i+1]-nums[i] <= maxDiff){
                count++;
                i+=2;
            }
            else{
                i++;
            }
            if(count >= p) return true;
        }
        return count >= p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0, high = nums[n-1]-nums[0];
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canFormPairs(nums, p, mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

}