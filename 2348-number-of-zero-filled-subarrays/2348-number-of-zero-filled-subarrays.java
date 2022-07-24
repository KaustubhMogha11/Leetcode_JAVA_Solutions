class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
     
        int i=0;
        int j=0;
     long count=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                count=count+j-i+1;
                j++;
                  
            }else{
                i=j;
               i++;
                j++;
            }
           
        }
        
        return count;
        
    }
}