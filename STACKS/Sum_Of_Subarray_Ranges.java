class Solution {
    public int[] nextMin(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        Arrays.fill(result, heights.length);

        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }

    public int[] prevMin(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        Arrays.fill(result, -1);

        for(int i = heights.length - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }

    public long sumSubarrayMins(int[] arr) {
        int[] next = nextMin(arr);
        int[] prev = prevMin(arr);

        long total = 0;

        for(int i = 0; i < arr.length; i++){
            long left = i - prev[i];
            long right = next[i] - i;
            total += left * right * (long) arr[i];
        }

        return total;
    }

    public int[] nextMax(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        Arrays.fill(result, heights.length);

        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] < heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }

    public int[] prevMax(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        Arrays.fill(result, -1);

        for(int i = heights.length - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }

    public long sumSubarrayMaxs(int[] arr) {
        int[] next = nextMax(arr);
        int[] prev = prevMax(arr);

        long total = 0;

        for(int i = 0; i < arr.length; i++){
            long left = i - prev[i];
            long right = next[i] - i;
            total += left * right * (long) arr[i];
        }

        return total;
    }

    public long subArrayRanges(int[] nums) {
        long max = sumSubarrayMaxs(nums);
        long min = sumSubarrayMins(nums);
        return max - min;
    }
}