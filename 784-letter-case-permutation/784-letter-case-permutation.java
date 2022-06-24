class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> ans=new ArrayList<>();
        String str="";
        permutation(s,0,ans,str);
        return ans;
    }
    
    public static void permutation(String s,int i,List<String> ans,String str)
    {
        if(i==s.length())
        {
            
            ans.add(str);
            return;
        }
        
 if(Character.isAlphabetic(s.charAt(i)))
       {
            permutation(s,i+1,ans,str+String.valueOf(s.charAt(i)).toLowerCase());
            permutation(s,i+1,ans,str+String.valueOf(s.charAt(i)).toUpperCase());
       }else{
            permutation(s,i+1,ans,str+s.charAt(i));
       }
    }
}