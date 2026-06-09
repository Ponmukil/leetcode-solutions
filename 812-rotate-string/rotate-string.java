class Solution {
    public boolean rotateString(String s, String goal) {
        int n1, n2;
        n1 = s.length();
        n2 = goal.length();
        if(n1 != n2) return false;

        String doubled = s + s;
        return doubled.contains(goal);
    }
}