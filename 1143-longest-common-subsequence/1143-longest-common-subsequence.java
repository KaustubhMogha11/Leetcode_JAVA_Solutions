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
            storage[m][n]=0;
            
            return storage[m][n];
        }
        
        for(int i=0; i<=m;i++)
        {
            storage[i][0]=0;
        }
        
         for(int i=0; i<=n;i++)
        {
            storage[0][i]=0;
        }
        
        for(int i=1; i<=m; i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(text1.charAt(m-i)==text2.charAt(n-j))
                {
                    storage[i][j]=1+storage[i-1][j-1];
                }else{
                     storage[i][j]=Math.max(storage[i-1][j],storage[i][j-1]);
                }
            }
        }
        
        // if(storage[m][n]!=0)
        // {
        //     return storage[m][n];
        // }
        
//         if(text1.charAt(0)==text2.charAt(0))
//         {
//             storage[m][n]=1+longestCommonSubsequence(text1.substring(1),text2.substring(1),storage);
            
//         }else{
//             int option1=longestCommonSubsequence(text1,text2.substring(1),storage);
//              int option2=longestCommonSubsequence(text1.substring(1),text2,storage);
         
//             storage[m][n]=Math.max(option1,option2);
        
//         }
        
        return storage[m][n];
        
        
        
    }
}