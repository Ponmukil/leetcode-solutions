class Pair{
    int row;
    int col;
    Pair(int r, int c){
        row = r;
        col = c;
    }
}

class Solution {    
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<Pair> q = new LinkedList<>();

        int fresh = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2) q.add(new Pair(i,j));
                if(grid[i][j] == 1) fresh++;
            }

        }
        if(fresh == 0) return 0;

        int[] cr = {-1,0,1,0};
        int[] cc = {0,-1,0,1};


        int min = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean rotten = false;
            for(int i = 0; i < size; i++){
                Pair p = q.poll();
                for(int j = 0; j < cr.length; j++){
                    int nr = p.row + cr[j];
                    int nc = p.col + cc[j];
                    if(nr >= 0 && nr < rows && nc >=0 && nc < cols && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        q.add(new Pair(nr,nc));
                        rotten = true;
                        fresh--;
                    }
                }
            }
            if(rotten) min++;
        }
        if(fresh ==  0) return min;
        else return -1;
    }
}