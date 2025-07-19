// Brute force 

class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(rowSet.contains(i)){
                    matrix[i][j] = 0;
                }
                if(colSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

// Optimal

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean zero_row = false;
        boolean zero_col = false;


        //check if the 0th col contains any 0 or not
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0){
                zero_col = true;
                break;
            }
        }

        //check if the 0th row contains any 0 or not
        for(int i=0; i<n; i++){
            if(matrix[0][i]==0){
                zero_row = true;
                break;
            }
        }

        //marking the 0th row and 0th column with 0's accordingly
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //if the 0th column contains any zero marking its respective row with zero
        for(int i=1; i<n; i++){
            if(matrix[0][i]==0){
                for(int j=1; j<m; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        //if the 0th row contains any zero marking its respective column with zero
        for(int i=1; i<m; i++){
            if(matrix[i][0]==0){
                for(int j=1; j<n; j++){
                    matrix[i][j]=0;
                }
            }
        }
        //if the 0th row was true then mark whole row with 0
        if(zero_row){
            for(int i=0; i<n; i++){
                matrix[0][i] = 0;
            }
        }

        //if the 0th col was true then mark whole row with o
        if(zero_col){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}