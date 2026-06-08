class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int min = Integer.MAX_VALUE;
        int n = strs.length;
        for(String str : strs){
            min = Integer.min(min, str.length());
        }
        
        for(int i = 0; i < min; i++){
            char ch = strs[0].charAt(i);
            boolean flag = false;
            for(int j = 0; j < n; j++){
                if(ch != strs[j].charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            ans += ch;
        }
        return ans;
    }
}