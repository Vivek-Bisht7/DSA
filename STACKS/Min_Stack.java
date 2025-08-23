class MinStack {

    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(!st.isEmpty() && !minStack.isEmpty() && st.peek()>=minStack.peek()){
            minStack.push(minStack.peek());
            return;
        }
        minStack.push(val);
    }
    
    public void pop() {
        st.pop();
        minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}