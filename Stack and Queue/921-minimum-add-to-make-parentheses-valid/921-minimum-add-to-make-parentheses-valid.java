class Solution {
    public int minAddToMakeValid(String s) {

//         char ch[]=s.toCharArray();
//         Stack<Character> st=new Stack<>();
//         for(int i=0; i<ch.length;i++)
//         {
//             if(ch[i]=='(')
//             {
//                 st.push(ch[i]);
//                 }
//             else if(!st.isEmpty() && st.peek()=='('){
//                     st.pop();
//             }else{
//                 st.push(ch[i]);
//             }
//         }
//             int count=0;
//             for(int j=0; j<st.size(); j++)
//             {count++;
//                 }
        
//         return count;
//     }
         Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') stack.push('(');
            else {
                if(!stack.isEmpty() && stack.peek() == '(' && c == ')')
                    stack.pop();
                else stack.push(')');
            }
        }
        return stack.size();
    }
}