class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
     
        int m=str1.length();
        int n=str2.length();
        
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++)
        {
            dp[i][0]=0;
        }
        
           for(int i=0;i<n+1;i++)
        {
            dp[0][i]=0;
        }
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
      int i=m;
        int j=n;
        String s="";
        while(i>0 && j>0){
		// we are starting from the last block and checking if the chars are same
		// if they are same then append it in the ans and move to diagonally above block
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                s=str1.charAt(i-1)+s;
                i--;
                j--;
            }
            else{
			// else if they are not equal then check for max value of left and upper block
			// whichever is max append that in answer and decrement the respective index
                if(dp[i-1][j]>dp[i][j-1]){
                    s=str1.charAt(i-1)+s;
                    i--;
                }
                else{
                    s=str2.charAt(j-1)+s;
                    j--;
                }
            }
        }
		// if anything remains then append it directly
        while(i>0){
            s=str1.charAt(i-1)+s;
            i--;
        }
        while(j>0){
            s=str2.charAt(j-1)+s;
            j--;
        }
        return s;
    }
}