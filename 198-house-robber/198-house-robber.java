class Solution {
    public int rob(int[] nums) {
     // int dp[]=new int[nums.length];
     //    Arrays.fill(dp,-1);
     //    return getMaximumSum(nums.length-1,nums,dp);
        
        int n=nums.length;
        int storage[]=new int[n+1];
        if(n==0)
        {
            return 0;
        }
        storage[0]=0;
        storage[1]=nums[0];
        
        for(int i=2;i<=n;i++){
            storage[i]=Math.max(storage[i-1], nums[i-1]+storage[i-2]);
        }
        
        return storage[n];
        
    }   
//     public int getMaximumSum(int index,int [] nums,int []dp)
//     {
//         // if(index==0)return nums[index];
//         // if(index<0)return 0;
//         // if(dp[index]!=-1)return dp[index];
//         // int pick=nums[index]+ getMaximumSum(index-2,nums,dp);
//         // int notPick=getMaximumSum(index-1,nums,dp);
//         // dp[index]=Math.max(pick,notPick);
//         // return dp[index];
        
//     }
        
}


