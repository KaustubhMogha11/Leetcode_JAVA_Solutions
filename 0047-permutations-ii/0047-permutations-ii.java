class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       
        List<List<Integer>> ans=new ArrayList<>();
        ans(nums,0,ans);
        return ans;
    }
    
    public static void ans(int[] nums,int index,List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ArrayList<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                ds.add(nums[i]);
            }
            if(!ans.contains(ds))
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            ans(nums,index+1,ans);
             swap(nums,i,index);
        }
    }
    
      public static void swap(int[] nums,int i, int index)
      {
          int t=nums[i];
          nums[i]=nums[index];
          nums[index]=t;
        
              
      }
}