class MyQueue {

    Stack <Integer> st;
    Stack <Integer> helper;
    public MyQueue() {
        st=new Stack<Integer>();
        helper=new Stack<Integer>();
    }
    
    public void push(int x) {
       // while(st.size()>0)
       // {
       //     helper.push(st.pop());
       // }
        st.push(x);
        // while(helper.size()>0)
        // {
        //     st.push(helper.pop());
        // }
        
    }
    
    public int pop() {
      // return st.pop();
        pushToStack2();
        return helper.pop();
    }
    
    
    public int peek() {
        pushToStack2();
        return helper.peek();
    }
    
    public boolean empty() {
        return st.size()==0 && helper.size()==0;
    }
    public void pushToStack2() {
        if(helper.empty()) {
            while(!st.empty()) {
                helper.push(st.pop());
            }
}
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */