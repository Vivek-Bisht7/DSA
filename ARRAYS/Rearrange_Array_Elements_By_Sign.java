//Brute force = using 2 extra arrays

//Better = using 1 extra array and 2 pointer +ve index and -ve index

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pindex = 0 , nindex = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                result[pindex] = nums[i];
                pindex += 2;
            }
            else{
                result[nindex] = nums[i];
                nindex += 2;
            }
        }

        return result;
    }
}