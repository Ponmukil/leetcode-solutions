class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ']'){
                StringBuilder temp = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '['){
                    temp.append(st.pop());
                }
                temp.reverse();
                st.pop();

                int count = 0;
                int multiplier = 1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    count = count + (st.pop() - '0') * multiplier;
                    multiplier *= 10;
                }
                StringBuilder temp1 = new StringBuilder();
                for(int j = 0; j < count; j++){
                    temp1.append(temp);
                }
                for(int j = 0; j < temp1.length(); j++){
                    st.push(temp1.charAt(j));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}