class Pair{
    int row;
    int col;
    Pair(int r, int c){
        row = r;
        col = c;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] ans = new int[m][n];

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();

        int[][] directions = {{0,-1},{-1,0},{0,1},{1,0}};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    q.add(new Pair(i,  j));
                    visited[i][j] = true;
                }
               
            }
        }

        while(!q.isEmpty()){
            Pair p = q.poll();

            for(int[] dir : directions){
                int r = p.row + dir[0];
                int c = p.col + dir[1];

                if(r >= 0 && c >= 0 && r < m && c < n && !visited[r][c]){
                    visited[r][c] = true;
                    q.add(new Pair(r, c));

                    ans[r][c] = ans[p.row][p.col]+1;
                }
            }
        }
        return ans;
    }
}