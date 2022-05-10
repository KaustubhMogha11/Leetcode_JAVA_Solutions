class Solution {
    public int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
             int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
                
            }
            
            if(count!=3)
            {
                return nums[i];
            }
    }
        return -1;
    }       
}