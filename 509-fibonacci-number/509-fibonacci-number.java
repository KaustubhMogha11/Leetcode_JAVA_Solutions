class Solution {
    public int fib(int n) {
        
//         if(n==0 || n==1)
//             return n;
        
//         return fib(n-1)+fib(n-2);
    
        int[] dp = new int[n+1];
        if(n == 0)
            return 0;
        
        dp[0] = 0;
        dp[1] = 1;
        
       
        //start from 2
        
        for(int i = 2; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
}
}