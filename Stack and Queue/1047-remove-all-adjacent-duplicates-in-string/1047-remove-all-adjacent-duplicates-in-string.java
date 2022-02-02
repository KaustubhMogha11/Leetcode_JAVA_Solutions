class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sb=new StringBuilder();
        Stack <Character> st=new Stack();
        for(int i=0; i<s.length(); i++)
        {
           
          if(!st.isEmpty() && st.peek()==s.charAt(i))
          {
             st.pop();   
            }else st.push(s.charAt(i));
        }
        for(int i=st.size(); i>0; i--){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}