class Pair{
    int row;
    int col;
    Pair(int r, int c){
        row = r;
        col = c;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        boolean[][] visited = new boolean[n][n];
        Queue<Pair> q = new LinkedList<>();

        if(grid[0][0] == 1) return -1;
        q.add(new Pair(0,0));
        visited[0][0] = true;

        int[][] directions = {{0,-1},{0,1},{1,0},{1,1},{1,-1},{-1,0},{-1,1},{-1,-1}};

        int ans = 1;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Pair p = q.poll();
                if(p.row == n-1 && p.col == n-1) return ans;
                for(int[] dir : directions){
                    int r = p.row + dir[0];
                    int c = p.col + dir[1];
                    if(r >= 0 && r < n && c >= 0 && c < n && !visited[r][c] && grid[r][c] == 0){
                        visited[r][c] = true;
                        q.offer(new Pair(r,c));
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}