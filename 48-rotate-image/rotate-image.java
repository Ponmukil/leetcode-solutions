class Solution {
    public void swap(int[][] matrix, int row , int col){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }

    public void reverse(int[] row){
        int j = row.length-1;
        int i = 0;
        while(i <= j){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n ;j++){
                swap(matrix,i,j);
            }
        }
        for(int i = 0;i < n;i++){
            reverse(matrix[i]);
        }
    }
}