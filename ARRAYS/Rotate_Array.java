// Brute force would be using a data structure and that would give space complexity of O(N)  and Time complexity of  O(N)





// This is another approach which do not use extra space but uses time complexity of O(N)


//To achieve this observer test cases index by index..
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        while(k-->0){
            for(int i=nums.length-1; i>0; i--){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
    }
}


// This is most optimal approach which gives time complexity of O(N) without any extra space

class Solution {
    public void reverse(int start , int end , int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if(k>nums.length)k=k%n;

        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }
}

