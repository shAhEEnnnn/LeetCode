class MyStack {
     Queue<Integer> q = new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
       //q ke front pe add krna
       q.add(x);
       int n= q.size();
       for(int i=1;i<=n-1;i++){
        q.add(q.remove());
       } 
    }
    
    public int pop() { //O(1)
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
    return (q.size()==0); 
    }
}
//Another Approach not optimize
//   Queue<Integer> q = new LinkedList<Integer>();
//     public MyStack() {
        
//     }
    
//     public void push(int x) {
//      q.add(x);   
//     }
    
//     public int pop() { //O(n)
//          int n=q.size();
//         for(int i=1;i<=n-1;i++){
//             q.add(q.remove());
//         }
//         return q.remove();
        
        
//     }
    
//     public int top() { //O(n)
//         int n=q.size();
//         for(int i=1;i<=n-1;i++){
//             q.add(q.remove());
//         }
//         int p=q.peek();
//         q.add(q.remove());
//         return p;
        
//     }
    
//     public boolean empty() {
//         return (q.size()==0);
//     }
// }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */