class Solution {
    public int calculateSubarrays(int[] nums , int goal){
        int l=0 , sum = 0 , count=0;

        for(int r=0; r<nums.length; r++){
            sum += nums[r];

            while(sum>goal && l<=r){
                sum -= nums[l++];
            }

            count += (l+r-1);
        }

        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return calculateSubarrays(nums,goal-1)-calculateSubarrays(nums,goal); 
    }
}