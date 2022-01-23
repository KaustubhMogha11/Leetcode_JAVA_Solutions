class Solution {
    public String removeOuterParentheses(String s) {
        
        // StringBuilder sb=new StringBuilder();
        // int count=0;
        // for(int i=0; i<s.length(); i++){
        //     //ignoring first bracket
        //     if(s.charAt(i)=='(')
        //     {
        //         count++;
        //         if(count>1)
        //         {
        //             sb.append(s.charAt(i));
        //         }
        //         //ignoring last bracket;
        //     }else{
        //         if(count>1)
        //         {
        //             sb.append(s.charAt(i));
        //         }
        //         count--;
        //     }
        // }
        // return sb.toString();
        
        // using stacks
        Stack st=new Stack();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(st.size()>=1)
                {
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }else{
                if(st.size()>1)
                {
                    sb.append(s.charAt(i));
                }
                st.pop();
                
            }
         
        }
           return sb.toString();
    }
}