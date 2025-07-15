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
    public void moveZeroes(int[] nums) {
        int temp = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[temp] = nums[i];
                temp++;
            }
        }
        for(int i=temp; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}