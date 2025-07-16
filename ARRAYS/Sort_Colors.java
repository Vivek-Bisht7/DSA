// This solution if good but we should do it in one pass.

class Solution {
    public void sortColors(int[] nums) {
        int zero=0 , one=0 , two=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) one++;
            else two++;
        }
        for(int i=0; i<nums.length; i++){
            if(zero>0){
                nums[i]=0;
                zero--;
            }
            else if(one>0){
                nums[i]=1;
                one--;
            }
            else{
                nums[i]=2;
                two--;
            }
        }
    }
}


// To do it in one pass use DUTCH NATIONAL FLAG ALGORITHM

class Solution {
    public void sortColors(int[] nums) {
        int low = 0 , mid = 0 , high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid++] = nums[low];
                nums[low++] = temp;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }
}