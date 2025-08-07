class Solution {
    public int findRow(int[][] matrix , int target){
        int low = 0 , high = matrix.length-1;

        while(low<=high){
            int mid = (low + high)/2;

            if(matrix[mid][0]<=target){
                if(matrix[mid][matrix[0].length-1]>=target){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                high = mid-1;
            }
        }
         return -1;
    }

    public boolean findCol(int[][] matrix , int target , int row){
        int low = 0 , high = matrix[row].length-1;

        while(low<=high){
            int mid = (low + high)/2;

            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
         return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = findRow(matrix,target);

        if(row==-1) return false;

        return findCol(matrix,target,row);
    }
}