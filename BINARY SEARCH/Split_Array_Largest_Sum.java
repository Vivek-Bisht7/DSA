// Brute force - same logic just linear search


// Optimal - Binary Search

class Solution {

    public int findHigh(int[] nums) {
        int res = Integer.MIN_VALUE;

        for (int num : nums) {
            res = Math.max(res, num);
        }

        return res;
    }

    public int findSum(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public boolean isValid(int[] nums, int k, int candidate) {
        int count = 1, currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] <= candidate) {
                currentSum += nums[i];
            } else {
                count++;
                currentSum = nums[i];
            }
        }

        return count <= k;
    }

    public int splitArray(int[] nums, int k) {
        int low = findHigh(nums), high = findSum(nums);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isValid(nums, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}