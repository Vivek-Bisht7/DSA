class Solution {
    public int find(int[] nums, int k) {
        int l = 0, countOdds = 0, result = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 != 0)
                countOdds++;

            while (countOdds > k) {
                if (nums[l++] % 2 != 0)
                    countOdds--;
            }

            result += (r - l + 1);
        }

        return result;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums, k) - find(nums, k - 1);
    }
}