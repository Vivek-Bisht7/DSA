class Solution {
    public int findCeil(int[] arr, int x) {
        
        int i = 0 , j=arr.length-1 , ans = -1;
        
        while(i<=j){
            int mid = (i+j)/2;
            
            if(arr[mid]>=x){
                ans = mid;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
}
