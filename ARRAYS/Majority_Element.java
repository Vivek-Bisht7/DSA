// Brute force = Use a nested for loop & check for one by one element that whether its count is greater than n/2 or not..
// T.C. = O(N^2) , S.C. = O(1)..

// Better = Use hashmap and after that iterate over all the values and check whether its count is greater or not..
// T.C. = O(N) , S.C = O(N)..

// Optimal = Booth's Moore Majority voting algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , result = nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i]==result){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                result=nums[i+1];
            }
        }
        return result;
    }
}