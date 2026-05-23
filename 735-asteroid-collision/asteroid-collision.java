class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;

        for(int i = 0; i < n; i++){
            int flag = 0;
            while(!st.isEmpty() && st.peek() >= 0 && asteroids[i] < 0){
                if(Math.abs(asteroids[i]) > st.peek()){
                    st.pop();
                }
                else if(Math.abs(asteroids[i]) == st.peek()){
                    st.pop();
                    flag = 1;
                    break;
                }
                else{
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) st.push(asteroids[i]);
        }
        int size = st.size();
        int[] ans = new int[size];
        for(int i = size-1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}