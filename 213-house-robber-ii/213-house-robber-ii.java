class Solution {
    public int rob(int[] nums) {
          if(nums.length==1)
        {
            return nums[0];
        }
      int arr1[]=new int[nums.length-1];
      int arr2[]=new int[nums.length-1];
        
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0)
            {
                arr1[i-1]=nums[i];
            }
            
            if(i!=nums.length-1)
            {
                arr2[i]=nums[i];
            }
            
        }
               return Math.max(robb(arr1),robb(arr2)); 
        
    }
    
       public int robb(int[] nums) {
           
           int dp[]=new int[nums.length+1];
           dp[0]=0;
           dp[1]=nums[0];
           for(int i=2;i<nums.length+1;i++)
           {
               dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
           }
           
           
           return dp[nums.length];
           
       }
}