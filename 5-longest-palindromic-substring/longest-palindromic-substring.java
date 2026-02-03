class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 1;
        int l = 0, r = 0, start = 0;
        for(int i = 0; i < s.length(); i++){
            l = i;
            r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > maxLen){
                    maxLen = r - l + 1;
                    start = l;
                } 
                l--;
                r++;
            }
            l = i-1;
            r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > maxLen){
                    maxLen = r - l + 1;
                    start = l;
                } 
                l--;
                r++;
            }
            System.out.println(maxLen);
        }
        System.out.println(start);
        return s.substring(start, start + maxLen);


    }
}   