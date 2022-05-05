class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
       int odds = 0;
        int i = 0, j = 0, flag = 0;
        int ans=0;
        while(j<nums.length)
        {
            if(nums[j]%2!=0)
            {
                odds++;
            }
            
      while(odds > k){
                if(nums[i++]%2!=0)odds--;
                flag = i;
            }
            if(odds == k){
                ans+=(i+1-flag);
                while(nums[i]%2==0){
                    i++;
                    ans++;
                }
            }
            j++;
        }
        return ans;
    }
}