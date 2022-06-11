class Solution {
    public int minOperations(int[] nums, int x) {
        
       int sum=0;
        for( int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        
      int rem = sum - x;
        if(rem==0)
            return nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        map.put(0,-1);
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            prefixSum+=nums[i];
            
            if(map.containsKey(prefixSum-rem))
            {
                max=Math.max(max,i-map.get(prefixSum-rem));
            }
            map.put(prefixSum,i);
            
        }
            
    return max==-1?-1:nums.length-max;
    }
}