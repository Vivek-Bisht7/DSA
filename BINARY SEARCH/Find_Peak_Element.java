// Brute force - Linear search

// Optimal - Binary search

// Think of it this way:

// To have a peak element at least some of the elements have to be in a sorted (ascending or descending order). Because, only then can you have a peak element.

// And because the question asks you to find any peak element, you can follow along this sorted path in the array to get to a peak element.

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0 , high = nums.length-1;

        while(low<high){
            int mid = (low+high)/2;

            if(nums[mid]<nums[mid+1]) low = mid + 1;
            else high = mid;
        }

        return low;
    }
}