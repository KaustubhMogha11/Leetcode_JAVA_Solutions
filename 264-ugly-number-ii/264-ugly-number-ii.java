class Solution {
    public int nthUglyNumber(int n) {
     
//         int dp[]=new int[n+1];
//         dp[1]=1;
//         int p1=1;
//         int p2=1;
//         int p3=1;
        
//         for(int i=2;i<n+1;i++)
//         {
//             int a=2*dp[p1];
//             int b=3*dp[p2];
//             int c=5*dp[p3];
            
//             int min=Math.min(a,Math.min(b,c));
//             dp[i]=min;
            
        
//             if(min == a) {
//                 p1++;
//             }
            
//             if(min == b) {
//                 p2++;
//             }
            
//             if(min == c) {
//                 p3++;
//             }
//         }
        int dp[]=new int[n+1];
        int p1=1;
        int p2=1;
        int  p3=1;
        dp[1]=1;
        
      
        
        for(int i=2;i<n+1;i++)
        {
           int a=2*dp[p1];
          int  b=3*dp[p2];
           int c=5*dp[p3];
            int min=Math.min(a,Math.min(b,c));

            dp[i]=min;
            
            if(min==a)
            {
                p1++;
            }
            if(min==b)
            {
                p2++;
            }
            if(min==c)
            {
                p3++;
            }
            
            
        }
        
        return dp[n];
    }
}