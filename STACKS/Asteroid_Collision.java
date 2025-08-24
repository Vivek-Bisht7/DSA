class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            
            while(!st.isEmpty() && st.peek()> 0 && a<0) {
                if (Math.abs(st.peek()) < Math.abs(a)) {
                    st.pop(); 
                    continue;
                } else if (Math.abs(st.peek()) == Math.abs(a)) {
                    st.pop(); 
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                st.push(a);
            }
        }

        int[] result = new int[st.size()];
        for (int i = st.size()-1; i>= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
