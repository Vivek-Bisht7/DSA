class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();

        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && ch-'0'<st.peek() && k-->0){
                st.pop();
            }
            if(!st.isEmpty() || (ch-'0')!=0){
                st.push(ch-'0');
            }
        }

         while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        for (int d : st) sb.append(d);

        return sb.toString();
    }
}