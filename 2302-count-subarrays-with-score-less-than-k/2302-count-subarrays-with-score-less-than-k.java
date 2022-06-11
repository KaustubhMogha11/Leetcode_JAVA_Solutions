class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0;
        int j=0;
        // long target=0;
        long count=0;
        int n=nums.length;
        // long p=0;
       long sum=0; 
        while(j<nums.length)
        {
            sum=sum+nums[j];
            // target=p*(j-i+1);

               
            
         
                while(sum*(j-i+1)>=k)
                {
                    sum=sum-nums[i];
                
                  i++;
                }
              
             count+=j-i+1;
            j++;
        }
        return count;
    }
}