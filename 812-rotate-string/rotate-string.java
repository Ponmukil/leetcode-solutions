class Solution {
    public boolean rotateString(String s, String goal) {
        int n1, n2;
        n1 = s.length();
        n2 = goal.length();
        if(n1 != n2) return false;

        for(int i = 0; i < n1; i++){
            if(s.equals(goal)){
                return true;
            }
            s = s.substring(1, n1) + s.charAt(0);
        }
        return false;
    }
}