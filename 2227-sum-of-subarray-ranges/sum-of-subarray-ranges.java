class Solution {

    public int[] findNSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] findNGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] findPSE(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] findPGE(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public long sumSubarrayMins(int[] arr) {
        long mod = -1;
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        long sum = 0;
        
        
        for(int i = 0; i < arr.length; i++){
           long rightCount = nse[i] - i;
           long leftCount = i - pse[i];

           long totSubArray = (rightCount * leftCount) ;
           long contribution = (totSubArray * arr[i]);
        
            sum = (sum + contribution) ;
        }

        return sum;

    }
    public long sumSubarrayMaxs(int[] arr) {
        long mod = -1;
        int[] nse = findNGE(arr);
        int[] pse = findPGE(arr);
        long sum = 0;
        
        
        for(int i = 0; i < arr.length; i++){
           long rightCount = nse[i] - i;
           long leftCount = i - pse[i];

           long totSubArray = (rightCount * leftCount) ;
           long contribution = (totSubArray * arr[i]) ;
        
            sum = (sum + contribution) ;
        }

        return sum;

    }
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }
}