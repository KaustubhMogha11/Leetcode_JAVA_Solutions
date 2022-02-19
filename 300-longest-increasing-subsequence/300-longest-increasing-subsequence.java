class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int storage[]=new int [nums.length];
        
        storage[0]=1;
        
        int ans=1;
        
        for(int i=1; i<nums.length;i++)
        {
            int max=1;
            for(int j=i-1; j>=0; j--)
            {
                if(nums[j]<nums[i])
                {
                int option=1+storage[j];
                
                    if(option>max)
                {
                    max=option;
                }
                }
            }
            
            storage[i]=max;
              if(max>ans){
            ans=max;
        }
        }
      
        
        return ans;
    }
}