class Solution {
    public int partitionDisjoint(int[] nums) {
        
        int leftMax=nums[0];
        int greater=leftMax;
        int ans=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>greater)
            {
                greater=nums[i];
            }
            
            if(nums[i]<leftMax)
            {
                ans=i;
                leftMax=greater;
            }
        }
        
        return ans+1;
    }
}