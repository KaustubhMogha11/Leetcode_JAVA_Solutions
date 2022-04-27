class Solution {
    public int threeSumClosest(int[] nums, int target) {
     
        Arrays.sort(nums);
        
        int nearest=nums[0]+nums[1]+nums[2];
        
        for(int i=0;i<nums.length-2;i++)
        {
            int lo=i+1;
            int hi=nums.length-1;
           
            
            while(lo<hi)
            {
               int sum = nums[i] + nums[lo] + nums[hi];   
                if(sum==target)
                {
                    return sum;
                }
                
                if(sum<target)
                {
                    lo++;
                }else 
                {
                    hi--;
                }
                
                if(Math.abs(sum-target)<Math.abs(nearest-target))
                {
                    nearest=sum;
                }
            }
            
            
        }
        
        return nearest;
    }
}