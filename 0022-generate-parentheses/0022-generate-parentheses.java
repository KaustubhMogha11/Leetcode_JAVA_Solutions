class Solution {
    public List<String> generateParenthesis(int n) {
        
         
       List<String> ans=new ArrayList<>();
        
     gen(n,0,0,ans,"");
        return ans;
    }
    
    public void gen(int max,int open,int close,List<String> ans,String s){
        
        if(s.length()==2*max)
        {
            ans.add(s);
            return;
        }
        
          if(open<max)
        {
             gen(max,open+1,close,ans,s+"(");
        }
        
         if(close<open)
        {
             gen(max,open,close+1,ans,s+")");
        }
        
        
        
        
        
    
    }
}