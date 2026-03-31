class Solution {
    public int dfs(int[][] grid, int i, int j, int[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 1;
        if(grid[i][j] == 0) return 1;
        if(visited[i][j] == 1) return 0;
        visited[i][j] = 1;
        int ans = 0;
        ans += dfs(grid, i+1, j, visited);
        ans += dfs(grid, i-1, j, visited);
        ans += dfs(grid, i, j+1, visited);
        ans += dfs(grid, i, j-1, visited);
        return ans;
    }
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    return dfs(grid, i, j, visited);
                }
            }
        }   
        return 0;     
    }
}