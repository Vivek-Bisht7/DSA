// Brute force using sorting 

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;

        int temp=0 , max = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i]==1){
                temp++;
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else{
                max = Math.max(max,temp);
                temp = 0;
            }
        }

        return Math.max(temp,max)+1;
    }
}

