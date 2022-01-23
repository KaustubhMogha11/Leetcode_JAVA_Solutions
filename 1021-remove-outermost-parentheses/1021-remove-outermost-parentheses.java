class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0; i<s.length(); i++){
            //ignoring first bracket
            if(s.charAt(i)=='(')
            {
                count++;
                if(count>1)
                {
                    sb.append(s.charAt(i));
                }
                //ignoring last bracket;
            }else{
                if(count>1)
                {
                    sb.append(s.charAt(i));
                }
                count--;
            }
        }
        return sb.toString();
    }
}