class Solution {

    public void rotate(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;

        //transpsoe
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i]  = temp;
                }
            }
        }

        //reverse rows
        for (int i=0; i<m; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
    }
}

    }
}