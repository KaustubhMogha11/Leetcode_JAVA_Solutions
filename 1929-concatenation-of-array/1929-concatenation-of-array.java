class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       int ans[]=new int[2*n];
        int k=0;
        for(int i=0;i<2*n; i++)
        {
            if(k==n)
            {
                k=0;
            }
            ans[i]=nums[k];
            k++;
            
        }
        return ans;
    }
}