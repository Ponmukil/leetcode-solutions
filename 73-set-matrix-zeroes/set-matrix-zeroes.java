class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int cell1 = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) cell1 = 0;
                    else{
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i = 1; i < rows;i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < cols; j++) matrix[i][j] = 0;
            }
        }

        for(int i = 0; i < cols;i++){
            if(matrix[0][i] == 0){
                for(int j = 0; j < rows; j++) matrix[j][i] = 0;
            }
        }

        if(cell1 == 0){
            for(int j = 0; j < cols; j++) matrix[0][j] = 0;
        }

    }
}