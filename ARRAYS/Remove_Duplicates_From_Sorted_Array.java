/*
    PATTERN OF THIS QUESTION (FILTERING USING TWO POINTERS)

        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (someCondition(nums, read)) {
                nums[write] = nums[read];
                write++;
            }
        }
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        // K=1 Because the 0th element would always be unique
        int k=1;

        // Edge case : Every single element is unique
        if(nums.length==1) return 1;

        // loop form i=1 because here we will compare the current element with the previous element nums[i] with nums[i-1] 
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

// T.C. => O(N)