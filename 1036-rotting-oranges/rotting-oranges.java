class Pair{
    int row;
    int col;
    Pair(int r, int c){
        row = r;
        col = c;
    }
    public String toString(){
        return row + " " + col;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        int[][] directions = {{0,-1},{-1,0},{0,1},{1,0}};
        int time = 0;
        int freshOrange = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j));
                    visited[i][j] = true;
                }
                else if(grid[i][j] == 1) freshOrange++;
            }
        }
        if(freshOrange ==  0) return 0;

        while(!q.isEmpty()){
            System.out.println(q);
            int size = q.size();
            boolean infected = false;

            for(int i = 0; i < size; i++){
                Pair p = q.poll();

                for(int[] dir : directions){
                    int r = p.row + dir[0];
                    int c = p.col + dir[1];

                    if(r >=0 && c >=0 && r <= m-1 && c <= n-1 && !visited[r][c] && grid[r][c] == 1){
                        visited[r][c] = true;
                        freshOrange--;
                        q.add(new Pair(r, c));
                        infected = true;
                    }
                }    
            }
             time++;
        }
        if(freshOrange == 0) return time-1;
        return -1;
    }
}