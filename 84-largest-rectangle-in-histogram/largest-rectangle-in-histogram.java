class Pair{
    int key;
    int val;
    public Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair> st = new Stack<>();
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && st.peek().val > heights[i]){
                Pair p = st.pop();
                int k;
                if(st.isEmpty()) k = -1;
                else k = st.peek().key;
                maxArea = Integer.max(maxArea, p.val * (i - k - 1));
            }
            st.push(new Pair(i, heights[i]));
        }
        while(!st.isEmpty()){
            Pair p = st.pop();
            int k;
            if(st.isEmpty()) k = -1;
            else k = st.peek().key;
            maxArea = Integer.max(maxArea, p.val * (n - k - 1));
        }
        return maxArea;
    }
}