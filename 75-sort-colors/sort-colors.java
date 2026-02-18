class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) red++;
            else if(nums[i] == 1) white++;
            else blue++;

        }
        int j = 0;
        for(int i = 0; i < red; i++){
            nums[j] = 0;
            j++;
        } 
        for(int i = 0; i < white; i++){
            nums[j] = 1;
            j++;
        }
        for(int i = 0; i < blue; i++){
            nums[j] = 2;
            j++;
        } 

    }
}