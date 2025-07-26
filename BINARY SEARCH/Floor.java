// analyse conditions...... shrink search space....dry run thoroughly...... code......

class Solution {
    public int findFloor(int[] arr, int x) {
        int i = 0 , j = arr.length-1 , ans = -1;
        
        while(i<=j){
            int mid = (i+j)/2;
            
            if(arr[mid]<=x){
                ans = mid;
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        
        return ans;
    }
}
