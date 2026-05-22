class Solution {
    public void greaterElements(int[] nums, int[] ans, Stack<Integer> st){
        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }
    }
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        greaterElements(nums, ans, st);
        greaterElements(nums,ans, st);
        return ans;
    }
}