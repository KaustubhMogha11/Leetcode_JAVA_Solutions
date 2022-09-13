class MyQueue {

    Stack<Integer> st;
    Stack<Integer> helper;
    public MyQueue() {
        
       st=new Stack<>();
        helper=new Stack<>();
    }
    
    public void push(int x) {
        
        st.push(x);
    }
    
    public int pop() {
        
        PushtoStack();
        return helper.pop();
    }
    
    public int peek() {
        PushtoStack();
        return helper.peek();
        
    }
    
    public boolean empty() {
        
        return st.size()==0 && helper.size()==0;
    }
    
    public void PushtoStack()
    {
        if(helper.empty())
        {
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