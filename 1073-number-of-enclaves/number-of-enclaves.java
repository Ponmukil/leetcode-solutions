class Solution {
    public void dfs(int[][] board, int i, int j, int[][] visited){

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return;
        if(board[i][j] == 0) return;
        if(visited[i][j] == 1) return;
        visited[i][j] = 1;

        dfs(board, i+1, j, visited);
        dfs(board, i-1, j, visited);
        dfs(board, i, j+1, visited);
        dfs(board, i, j-1, visited);

    }
    
    public int numEnclaves(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] visited = new int[m][n];
        int cnt = 0;
        for(int i = 0; i < m; i++){
            if(board[i][0] == 1 && visited[i][0] == 0){
                dfs(board, i, 0, visited);
            }
            if(board[i][n-1] == 1 && visited[i][n-1] == 0){
                dfs(board, i, n-1, visited);
            }
        }
        for(int i = 0; i < n; i++){
            if(board[0][i] == 1 && visited[0][i] == 0){
                dfs(board, 0, i, visited);
            }
            if(board[m-1][i] == 1 && visited[m-1][i] == 0){
                dfs(board, m-1, i, visited);
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(board[i][j] == 1 && visited[i][j] == 0){
                    cnt++;
                }
            }
        }
        return cnt;

    }
}