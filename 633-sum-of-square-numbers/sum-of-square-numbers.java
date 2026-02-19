class Solution {
    
    public boolean judgeSquareSum(int c) {
        
        int l = 0, r = (int) Math.sqrt(c);
        while(l <= r){
            long val = (long) l*l + (long) r*r;
            if(val == c) return true;
            else if(val > c) r--;
            else l++;
        }
        return false;

    }
}