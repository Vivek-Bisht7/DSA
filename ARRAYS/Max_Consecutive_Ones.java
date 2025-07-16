class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0 , maxCount=0;

        for(int temp : nums){

            if(temp==1) count++;

            else{
                maxCount = Math.max(count,maxCount);
                count=0;
            }
        }

        return Math.max(count,maxCount);
    }
}

// T.C = O(N)