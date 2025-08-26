class Solution {
     public int[] nextMin(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        Arrays.fill(result,heights.length);

        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }


     public int[] prevMin(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        int n = heights.length-1;

        Arrays.fill(result,-1);

        for(int i=n; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] next = nextMin(arr);
        int[] prev = prevMin(arr);

        long total = 0 , mod = 1000000007;

        for(int i=0; i<arr.length; i++){
            int left = i-prev[i];
            int right = next[i]-i;

            total = (total + (long)left * right % mod * arr[i] % mod) % mod;
        }

        return (int)total;
    }
}