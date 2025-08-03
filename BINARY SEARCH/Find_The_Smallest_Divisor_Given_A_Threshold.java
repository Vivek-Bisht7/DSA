class Solution {

    public int findHigh(int[] nums){
        int ans = Integer.MIN_VALUE;

        for(int num : nums){
            if(ans<num) ans = num;
        }

        return ans;
    }

    public boolean isValid(int[] nums, int threshold, int candidate){
        int total = 0;

        for(int num : nums){
            int ceil = (num+candidate-1)/candidate;

            total += ceil;
        }

        return total<=threshold;
    }



    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1 , high = findHigh(nums);

        while(low<=high){
            int mid = (low+high)/2;

            if(isValid(nums,threshold,mid)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }
}