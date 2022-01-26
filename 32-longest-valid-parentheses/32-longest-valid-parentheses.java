class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer>st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.size()!=0){
                    max=Math.max(max,i-st.peek());
                }
                else
                st.push(i);
            }
        }
        return max;
    }
}

