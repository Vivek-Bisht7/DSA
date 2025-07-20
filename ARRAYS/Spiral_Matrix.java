/// Completely implementation based problem.. to implement it I have use 4 pointers indicating the corners of the 2d array and then we thorough dry I have figured out that how to shrink the sprial and when to stop

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;
        int top = 0 , right = n-1 , bottom = m-1 , left = 0;
        List<Integer> ans = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
            ans.add(matrix[top][i]);
        }
        top++;

        for(int i=top; i<=bottom; i++){
            ans.add(matrix[i][right]);
        }
        right--;

        if(top<=bottom){
            for(int i=right; i>=left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
        }

        if(right>=left){
            for(int i=bottom; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        }
        return ans;
    }
}