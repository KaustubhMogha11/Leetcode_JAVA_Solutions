class Solution {
    public int maxProfit(int[] prices, int fee) {
        
     
         int n  = prices.length;
        
        int dp[][] = new int[n][2];
        for(int i =0;i<n;i++)
            for(int j =0;j <2;j++)
                dp[i][j] = -1;
        return recu(0,1,prices,n,dp,fee);
    }
    
    public int recu(int ind ,int buy,int[] price,int n,int dp[][],int fee){
        if(ind >= n) return 0;
        if(dp[ind][buy] != -1) return dp[ind][buy];
        int profit = 0;
        if(buy == 1 ){
            profit = Math.max(-price[ind] + recu(ind+1,0,price,n,dp,fee),0+     recu(ind+1,1,price,n,dp,fee));
        } else {
            profit = Math.max(price[ind]-fee + recu(ind+1,1,price,n,dp,fee),0+ recu(ind+1,0,price,n,dp,fee));
        }
       // if(dp[i][j] != -1) return dp[i][j];
        return dp[ind][buy] = profit;
    }
}