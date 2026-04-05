class Solution {
    public void letterCombination(String curr, String digits, String[] letters, List<String> ans){
        if(digits.isEmpty()){
            ans.add(curr);
            return;
        }
        String curr_letters = letters[digits.charAt(0) - '2'];
        for(char ch : curr_letters.toCharArray()){
            letterCombination(curr+ch, digits.substring(1), letters, ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombination("", digits, letters, ans);
        return ans;
    }
}