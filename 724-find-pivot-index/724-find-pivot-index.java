class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        
        int rSum=sum;
        int lSum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            rSum-=nums[i];
            if(rSum==lSum)
            {
                return i;
            }
            
            lSum+=nums[i];
        }
        
        return -1;
    }
}