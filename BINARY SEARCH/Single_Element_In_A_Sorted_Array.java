 // use low or high for answer mid is just a tool in binary search..

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0 , high = nums.length-1;

        while(low<high){
            int mid = (low + high)/2;

            if(mid%2 != 0) mid--;

            if(nums[mid] == nums[mid+1]){
                low = mid + 2;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}