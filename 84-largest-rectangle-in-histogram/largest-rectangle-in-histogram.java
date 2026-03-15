class Pair{
    int key;
    int val;
    Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
            int max = Integer.MIN_VALUE;
            int i = 0;
            Stack<Pair> st = new Stack<>();

            while(i < heights.length){

                while(!st.isEmpty() && st.peek().val > heights[i]){
                    int k;
                    Pair p = st.pop();
                    if(st.isEmpty()) k = -1;
                    else k = st.peek().key; 
                    max = Integer.max(max, p.val * (i - k - 1));
                }

                st.push(new Pair(i, heights[i]));
                i++;
            }  

            while(!st.isEmpty()){
                int k;
                Pair p = st.pop();
                if(st.isEmpty()) k = -1;
                else k = st.peek().key; 
                max = Integer.max(max, p.val * (heights.length - k -1));

            }
            return max;

    }
    
}