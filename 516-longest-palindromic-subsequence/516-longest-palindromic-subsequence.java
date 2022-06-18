class Solution {
    public int longestPalindromeSubseq(String s) {
      
//        String b="";
//         for(int i=s.length()-1;i>=0;i--){
//             b=b+s.charAt(i);
//         }
        
//         int m=s.length();
//         int n=b.length();
//         int dp[][]=new int[m+1][n+1];
        
//        for(int i=0;i<m+1;i++){
//             for(int j=0;j<n+1;j++){
//                 if(i==0 || j==0){
//                     dp[i][j]=0;
//                 }
//             }
//         }
        
//         for(int i=1;i<m+1;i++)
//         {
//             for(int j=1;j<n+1;j++)
//             {
//                 if(s.charAt(m-i)==b.charAt(n-j))
//                 {
//                     dp[i][j]=1+dp[i-1][j-1];
//                 }else{
//                     dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//                 }
//             }
//         }
        
//         return dp[m][n];
        String b="";
        for(int i=s.length()-1;i>=0;i--)
        {
            b=b+s.charAt(i);
        }
        
        int m=s.length();
        int n=m;
        int dp[][]=new int [m+1][n+1];
        
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(s.charAt(m-i)==b.charAt(n-j))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        
        return dp[m][n];
    }
}