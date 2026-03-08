class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long v = (long) val;

        if (st.isEmpty()) {
            st.push(v);
            min = v;
        }
        else if (v >= min) {
            st.push(v);
        }
        else {
            st.push(2 * v - min);   // encoded value
            min = v;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();

        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {
        long top = st.peek();

        if (top < min) {
            return (int) min;
        }
        else {
            return (int) top;
        }
    }

    public int getMin() {
        return (int) min;
    }
}

// //easy method
// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minSt;
//     public MinStack() {
//         st=new Stack<>();
//         minSt = new Stack<>();
        
//     }
    
//     public void push(int val) {
//        st.push(val);
//        if(minSt.size()==0 || val<minSt.peek()) minSt.push(val);
//        else minSt.push(minSt.peek()); 
//     }
    
//     public void pop() {
//        st.pop();
//        minSt.pop(); 
//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//        return minSt.peek(); 
//     }
// }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */