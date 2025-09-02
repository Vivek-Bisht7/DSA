class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        // Use a stack to keep track of indexes of elements whose "next greater element" we haven’t found yet

        Stack<Integer> st = new Stack<>();

        // Loop through the array twice (2 * n) to simulate the circular nature

        for (int i = 0; i < 2 * n; i++) {
            // i % n will return i if its smaller then n and when i is greater then n then it will run from 0 to n-1

            int num = nums[i % n];

            // If the current number is greater than the element at index on top of the stack, we found the "next greater" → update the answer and pop from stack

            while (!st.isEmpty() && nums[st.peek()] < num) {
                ans[st.pop()] = num;
            }

            // If we’re still in the first pass (i < n), push the index onto the stack (so it can be matched later)

            if (i < n) {
                st.push(i);
            }
        }

        return ans;
    }
}
