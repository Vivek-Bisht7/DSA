// Brute force = Generate all permutaion in a sorted manner and then return next  

// Optimised

class Solution {
    public static void reverse(int[] arr , int left , int right) {

    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
    
    public void nextPermutation(int[] nums) {
        int index = -1 , n = nums.length;

        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums, 0, n-1);
                return;
        }

        for(int i=n-1; i>=-1; i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                break;
            }
        }

        reverse(nums , index+1 , n-1);

    }
}