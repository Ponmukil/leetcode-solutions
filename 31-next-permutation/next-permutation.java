class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                int val = nums[i];
                int min = Integer.MAX_VALUE;
                int min_index = i;
                for(int j = i+1; j < n; j++){
                    if(nums[j] < min && nums[j] > val){
                        min = nums[j];
                        min_index = j;
                    }
                }
                int temp = nums[min_index];
                nums[min_index] = nums[i];
                nums[i] = temp;

                Arrays.sort(nums,i+1, n);
                return;
            }
        }
        for(int i = 0; i < n/2; i++){
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        }
    }
}