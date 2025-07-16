// Brute force Time complexity => O(N^2)

// Better Approach Time complexity => O(N) Space complexity => O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        } 
        return new int[]{};
    }
}

// Optimal Approach Time complexity => O(N) works only if the Array is sorted 

// If you want to try this approach for unsorted arrays then you could sort them along with their indexes like you used to do in greedy problems and then apply this 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointers
        int start = 0; 
        int end = nums.length-1;

        while(start<end){
            if((nums[start]+nums[end])==target){
                return new int[]{start,end};
            }
            else if(nums[start]+nums[end]>target) end--;
            else if(nums[start]+nums[end]<target) start++;
        }

        return new int[]{};
    }   
}
