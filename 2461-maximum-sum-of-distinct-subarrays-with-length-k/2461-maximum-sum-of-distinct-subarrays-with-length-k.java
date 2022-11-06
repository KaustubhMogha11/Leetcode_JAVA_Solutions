class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int j=0;
        int i=0;
        
        long sum=0;
      // sum+=nums[p];
        HashSet<Integer> set=new HashSet<>();
        long max=sum;
        while(j<nums.length)
        {
            int val=nums[j];
           
            
           
          
          
       while (set.contains(val) || (j - i + 1 > k) && i< j) {
				sum -= nums[i];
				set.remove(nums[i++]);
			}
             sum=sum+nums[j];
           set.add(val);
            
            
             if(j-i+1==k)
            {
                max=Math.max(max,sum);
            }
            
            
            j++;
        }
        
        return max;
    }
}