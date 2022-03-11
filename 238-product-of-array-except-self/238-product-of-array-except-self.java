class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int ans[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++)
//         {
//             int p=1;
//             for(int j=0;j<nums.length;i++)
//             {
//                 if(i!=j)
//                 {
//                 p=p*nums[j];
//             }
                
//             }
//             ans[i]=p;
//         }
        
//         return ans;
        
        int ans[]=new int[nums.length];
        int zero=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zero++;
            else
                k=k*nums[i];
        }
        
        if(zero>1)
        {
           Arrays.fill(ans,0);
            return ans;
        }
        
        for(int i=0;i<nums.length;i++)
        {
           if(zero==1){
                if(nums[i]==0) 
                    nums[i]=k;
                else nums[i]=0;
            }
            else nums[i]=k/nums[i];
        }
        return nums;
        
    }
}