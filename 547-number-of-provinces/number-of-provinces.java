class Solution {
    public void dfs(int[][] isConnected, int i, int[] visited){
        visited[i] = 1;
        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j] == 1 && visited[j] == 0){
                dfs(isConnected, j, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int cnt = 0;
        int[] visited = new int[n];
        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                cnt++;
                visited[i] = 1;
                dfs(isConnected, i, visited);
            }
        }
        return cnt;
    }
}