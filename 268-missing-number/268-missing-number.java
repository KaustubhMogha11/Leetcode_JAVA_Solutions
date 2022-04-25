class Solution {
    public int missingNumber(int[] nums) {
        
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i];
            
            if(nums[i]<nums.length && nums[i]!=nums[correct])
            {
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }else
            {
                i++;
            }
            
            
            
        }
        
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index)
                return index;
        }
        
        return nums.length;
    }
}