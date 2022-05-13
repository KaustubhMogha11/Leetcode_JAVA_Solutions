class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        int temp1[]=new int[nums.length-1];
        int temp2[]=new int[nums.length-1];
        
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0)
            {
                temp1[i-1]=nums[i];
            }
            if(i!=nums.length-1)
            {
                temp2[i]=nums[i];
            }
            
        }
        
        return Math.max(robm(temp1),robm(temp2));
    }
    
     public int robm(int[] nums) {
        int n=nums.length;
      int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        
        for(int i=2;i<=nums.length;i++)
        {
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
            
          return dp[n];
        }

}