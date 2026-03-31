class Solution {
    public void dfs(int[][] image, int sr, int sc, int color, int si){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return;
        if(image[sr][sc] != si) return;
        image[sr][sc] = color;
        dfs(image, sr+1, sc, color, si);
        dfs(image, sr-1, sc, color, si);
        dfs(image, sr, sc+1, color, si);
        dfs(image, sr, sc-1, color, si);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int si = image[sr][sc];
        if(si == color) return image;
        dfs(image, sr, sc, color, si);
        return image;
    }
}