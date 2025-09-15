class Solution {

    public int[] previousProduct(int[] nums){
        int[] previousProductArray = new int[nums.length];
        previousProductArray[0] = 1;

        for(int i=1; i<nums.length; i++){
            previousProductArray[i] = previousProductArray[i-1]*nums[i-1];
        }

        return previousProductArray;
    }

    public int[] nextProduct(int[] nums){
        int[] nextProductArray = new int[nums.length];
        nextProductArray[nums.length-1] = 1;

        for(int i= nums.length-2; i>=0; i--){
            nextProductArray[i] = nextProductArray[i+1] * nums[i+1];
        }

        return nextProductArray;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] previousProductArray = previousProduct(nums);
        int[] nextProductArray = nextProduct(nums);

        int[] res = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            res[i] = previousProductArray[i]*nextProductArray[i];
        }

        return res;
    }
}