class Solution {
    public int[] nextLowest(int[] heights){
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


     public int[] prevLowest(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[heights.length];

        int n = heights.length-1;

        Arrays.fill(result,-1);

        for(int i=n; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                result[st.pop()] = i;
            }
            st.push(i);
        }

        return result;
    }

    public int largestRectangleArea(int[] heights) {
        int[] prev = prevLowest(heights);
        int[] next = nextLowest(heights);

        int n = heights.length-1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<=n; i++){
            int x = next[i]-prev[i]-1;
            int area = heights[i] * x;
            max = Math.max(area,max);
        }

        return max;
    }
}