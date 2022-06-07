class Solution {
    public int getMaxLen(int[] nums) {
      
     int pos=0;
        int neg=0;
        int ans=0;
        
        
        for(int i=0;i<nums.length;i++)
        {
         if(nums[i]==0)
         {
             pos=0;
             neg=0;
         }else if(nums[i]>0)
         {
             pos++;
             neg=neg==0 ? 0:neg+1;
         }else 
         {
              int temp = pos;
                pos = neg == 0 ? 0  : neg+1;
                neg = temp+1;
         }
            ans=Math.max(ans,pos);
        }
        
        return ans;
    }
}