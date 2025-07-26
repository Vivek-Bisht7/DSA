class Solution {
    public int firstIndex(int[] nums , int target){
            int i =0 , j = nums.length-1 , ans = -1;

            while(i<=j){
                int mid = (i+j)/2;

                if(nums[mid]>target){
                    j = mid-1;
                }
                else if(nums[mid]<target){
                    i = mid + 1;
                }
                else{
                    ans = mid;
                    j = mid-1;
                }
            }

            return ans;
        }

        public int lastIndex(int[] nums , int target){
            int i =0 , j = nums.length-1 , ans = -1;

            while(i<=j){
                int mid = (i+j)/2;

                if(nums[mid]>target){
                    j = mid-1;
                }
                else if(nums[mid]<target){
                    i = mid + 1;
                }
                else{
                    ans = mid;
                    i = mid+1;
                }
            }

            return ans;
        }

    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};

        return new int[]{firstIndex(nums,target),lastIndex(nums,target)};
    }
}