// This is optmial approach in which deduct the sum of actual elements with the given numbers sum in order to get the missing number

class Solution {
    public int missingNumber(int[] nums) {
        //Formula to calculate total sum of n numbers
        int totalSum = nums.length*(nums.length+1)/2;

        //finding sum of given numbers
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return totalSum-sum;
    }
}