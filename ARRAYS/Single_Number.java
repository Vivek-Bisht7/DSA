// Uses XOR operator because of its properties a^a = 0  and  a^0 = 0

// So, 2^3^1^2^4^1^3 = 4

class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            result = result^nums[i];
        }

        return result;
    }
}