// This i have solved by hit and trial 

class Solution {
    int lowerBound(int[] arr, int target) {

        int i =0 , j = arr.length-1 , ans = j+1;
        
        while(i<=j){
            int mid = (i+j)/2;

            // Lower Bound =>    target<=arr[mid]
            
            if(arr[mid]>=target){
                ans = mid;
                j = mid-1;
            }
            else{
                i = mid + 1;
            }
           
        }
        return ans;
    }
}

// This problem is clearly LOWER BOUND...

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i =0 , j = nums.length-1 , ans = j+1;
        
        while(i<=j){
            int mid = (i+j)/2;

            // Lower Bound =>    target<=arr[mid]
            
            if(nums[mid]>=target){
                ans = mid;
                j = mid-1;
            }
            else{
                i = mid + 1;
            }
           
        }
        return ans;
    }
}
