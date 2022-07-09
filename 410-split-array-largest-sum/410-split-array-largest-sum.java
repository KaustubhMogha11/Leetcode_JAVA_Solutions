class Solution {
    public int splitArray(int[] nums, int m) {
        
        int hi=0;
        int lo=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            hi+=nums[i];
            lo=Math.max(lo,nums[i]);
        }
        
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            int n=numberOfSubarray(nums,mid);
            if(n>m)
            {
                lo=mid+1;
            }else{
                ans=mid;
                hi=mid-1;
                    
            }
        }
        
        return ans;
    }
    
     public int numberOfSubarray(int[] nums,int mid){
         int count=0;
         int sum=0;
         for(int i=0;i<nums.length;i++)
         {
             if(nums[i]+sum>mid)
             {
                 sum=nums[i];
                 count++;
             }else{
                 sum+=nums[i];
             }
         }
         
         return count+1;
     }
}