class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
     int storage[][]=new int [text1.length()+1][text2.length()+1];
        return longestCommonSubsequence(text1,text2, storage);
        
    }
    public int longestCommonSubsequence(String text1, String text2, int[][] storage) {
        
        int m=text1.length();
        int n=text2.length();
        
        if(m==0 || n==0)
        {
            return 0;
        }
        
        if(storage[m][n]!=0)
        {
            return storage[m][n];
        }
        
        if(text1.charAt(0)==text2.charAt(0))
        {
            storage[m][n]=1+longestCommonSubsequence(text1.substring(1),text2.substring(1),storage);
            
        }else{
            int option1=longestCommonSubsequence(text1,text2.substring(1),storage);
             int option2=longestCommonSubsequence(text1.substring(1),text2,storage);
         
            storage[m][n]=Math.max(option1,option2);
        
        }
        
        return storage[m][n];
        
        
        
    }
}