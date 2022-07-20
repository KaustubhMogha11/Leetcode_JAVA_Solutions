class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()==0)
            return 0;
        
         int n=haystack.length();
        int m=needle.length();
        
       if(n==m && haystack.equals(needle)) 
           return 0;   
        
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            if(needle.equals(haystack.substring(i,i+needle.length())))
                return i;
        }
        
        return -1;
    }
}