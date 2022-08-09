class Solution {
    public int deleteAndEarn(int[] nums) {
      int count[]=new int[10002];
        
        for(int val:nums)
        {
            count[val]++;
        }
        
        int dp[]=new int[count.length+1];
        
        for(int i=2;i<count.length+1;i++)
        {
            dp[i]=Math.max((i-1)*count[i-1]+dp[i-2],dp[i-1]);
        }
        
        return dp[count.length];
    }
}