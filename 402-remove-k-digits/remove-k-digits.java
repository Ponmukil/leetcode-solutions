class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(n == k) return "0";

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            int val = num.charAt(i) - '0';
            while(!st.isEmpty() && st.peek() > val){
                st.pop();
                k--;
                if(k == 0) break;
            }
            if(k == 0){
                for(int j = i; j < n; j++){
                    st.push(num.charAt(j) - '0');
                }
                break;
            }
            st.push(val);
        }
        while(k != 0){
            st.pop();
            k--;
        }  
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        while(ans.charAt(0) == '0' && ans.length() != 1) ans = ans.substring(1, ans.length());
        return ans;
    }
}