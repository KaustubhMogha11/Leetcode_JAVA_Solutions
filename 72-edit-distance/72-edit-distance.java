class Solution {
    public int minDistance(String word1, String word2) {
        
//         int m=word1.length();
//         int n=word2.length();
//         int dp[][]=new int[m+1][n+1];
//       for(int i=0;i<=m;i++)
//         {
//             dp[i][0]=i;
//         }
//          for(int j=0;j<=n;j++)
//         {
//             dp[0][j]=j;
//         }
        
//         for(int i=1; i<=m;i++)
//         {
//             for(int j=1; j<=n;j++)
//             {
//                 if(word1.charAt(m-i)==word2.charAt(n-j))
//                 {
//                     dp[i][j]=dp[i-1][j-1];
//                 }else
//                 {
//                     dp[i][j]=1+Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1]));
//                 }
                
//             }
            
           
//         }
//          return dp[m][n];
          int storage[][]=new int[word1.length()+1][word2.length()+1];
        
        for(int i=0; i<=word1.length(); i++)
        {
            for(int j=0; j<=word2.length();j++)
            {
                storage[i][j]=-1;
            }
            
            
        }
           
      return minDistancem(word1,word2, storage);
                           
    }
    
    public int minDistancem(String word1, String word2, int[][] storage) {
        
        int m=word1.length();
        int n=word2.length();
        
        if(storage[m][n]!=-1)
        {
            return storage[m][n];
        }
        
        if(m==0)
        {
            storage[m][n]=n;
            return storage[m][n];
        }
        
          
        if(n==0)
        {
            storage[m][n]=m;
            return storage[m][n];
        }
         
         if(word1.charAt(0)==word2.charAt(0))
         {
              storage[m][n]=minDistancem(word1.substring(1), word2.substring(1), storage);
         }else{
             int opt1=minDistancem(word1.substring(1), word2.substring(1), storage);
             int opt2=minDistancem(word1.substring(1), word2, storage);
                 int opt3=minDistancem(word1, word2.substring(1), storage);
             storage[m][n]=Math.min(opt1,Math.min(opt2,opt3))+1;
         }
        
        return storage[m][n];
     }
}
    