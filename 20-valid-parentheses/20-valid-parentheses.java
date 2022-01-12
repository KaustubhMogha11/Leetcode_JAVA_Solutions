class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack= new Stack<>();
        for(int i=0 ;i<s.length();i++){
            Character c = s.charAt(i);
            if(c=='(' ||c=='{' || c=='[' ){
                stack.push(c);
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.size() >0 ){
            return false;
        }
        return true;
    }
}