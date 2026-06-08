class Solution {
    public String reverseWords(String s) {
        String[] words;
        StringBuilder ans = new StringBuilder();
        words = s.trim().split("\\s+");
        for(int i = words.length-1; i >= 0; i--){
            ans = ans.append(words[i]);
            if(i != 0) ans.append(" ");
        }
        
        return ans.toString();
    }

}