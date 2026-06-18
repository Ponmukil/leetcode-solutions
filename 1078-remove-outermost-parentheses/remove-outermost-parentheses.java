class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int cnt = 0;
        int start = 0;
        StringBuilder ans = new  StringBuilder();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(') cnt++;
            else cnt--;
            if(cnt == 0){
                ans.append(s.substring(start+1, i));
                start = i+1;
            }
        }
        return ans.toString();
    }
}