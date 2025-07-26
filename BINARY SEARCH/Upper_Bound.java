class Solution {
    int upperBound(int[] arr, int target) {
        int i = 0 , j = arr.length-1 , ans = arr.length;
        
        while(i<=j){
            int mid = (i+j)/2;

            // Upper Bound => target<arr[mid]
            
            if(arr[mid]>target){
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
