class Solution {
    public void findIsland(char[][] grid, int row, int col, int[][] visited){
        int rows = grid.length, cols = grid[0].length;
        if(row >= rows || col >= cols || row < 0 || col < 0) return;
        
        // System.out.println(row + " " + col);
        // 
        // System.out.println("Helo");
        // 
        if(grid[row][col] == '1' && visited[row][col]  == 0){
            System.out.println(row + " "+ col);
            visited[row][col] = 1;
            findIsland(grid, row-1, col, visited);
            findIsland(grid, row, col-1, visited);
            findIsland(grid, row+1, col, visited);
            findIsland(grid, row, col+1, visited);
        }
        
    }
    public int numIslands(char[][] grid) {
        int cnt = 0;
        int rows = grid.length, cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    // System.out.println(i + " " + j);
                    cnt++;
                    findIsland(grid, i, j, visited);
                }
            }
        }
        return cnt;
    }
}