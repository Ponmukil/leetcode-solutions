class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] out = new int[m*n];
        int idx = 0;
        for(int i = 0; i < m+n-1; i++){
            if(i % 2 == 0){
                int r = Math.min(i, m-1);
                int c = i - r;
                while(r >= 0 && c < n){
                    out[idx++]  = mat[r][c];
                    r--;
                    c++;
                }
            }
            else{
                int c = Math.min(i, n-1);
                int r = i - c;
                while(c >= 0 && r < m){
                    out[idx++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }
        return out;
    }
}